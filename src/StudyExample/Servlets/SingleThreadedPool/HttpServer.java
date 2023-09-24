package StudyExample.Servlets.SingleThreadedPool;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

//для реализации использую пакет класс ServerSocket из пакета java.net
public class HttpServer {

    private final int port;

    public HttpServer(int port) {
        this.port = port;
    }

    //метод для запуска сервера: создаю ServerSocket передав порт, установленный в качестве поля при создании класса
    public void run() {
        try {
            var server = new ServerSocket(port);//бронирую порт
            var socket = server.accept();//принмиает соединение от клиента. постоянно ожидаем,пока кто-то не отправит запрос,
            // тк медод accept - блокирующий
            processSocket (socket);// после того , как запрос получен, мы его обрабатываем
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void processSocket(Socket socket) {
        try (socket;
            var inputStream = new DataInputStream(socket.getInputStream());//для считывания инфо из request
            var outputStream = new DataOutputStream(socket.getOutputStream());//на каждый request хотим дать response
        ) {
            //step 1 - handle request. логика обработки зависит от типа данных, для примера просто вывести на экран
            System.out.println("Request: " + new String(inputStream.readNBytes(400)));
            //step 2 - handle response. response делаю в виде html страницы, это будет body
            var body = Files.readAllBytes(Path.of("resources", "example.html"));

            //подготавливаю header. это будет строка, в которой будет перечень header,но для упрощения добавлю и стартовую
            // строку, которая в версии http_2 и так добавлена в заголовке
            var headers = """
                    HTTP/1.1 200 OK
                    content-type: text:html
                    content-length: %s
                    """.formatted(body.length).getBytes(StandardCharsets.UTF_8);
            outputStream.write(headers);
            outputStream.write(System.lineSeparator().getBytes());//header разделяются строкой, поэтому визуально отделяю их
            outputStream.write(body);
        } catch (IOException e) {
            //TODO: 24/09/23 log error message
            e.printStackTrace();//catch все exception, тк если пробросить далее, это остановит сервер
        }
    }
}
