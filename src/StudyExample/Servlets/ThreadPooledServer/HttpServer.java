package StudyExample.Servlets.ThreadPooledServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//для реализации использую пакет класс ServerSocket из пакета java.net
public class HttpServer {

    private final ExecutorService pool;
    private final int port;

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }

    private boolean stopped;

    public HttpServer(int port, int poolSize) {
        this.pool = Executors.newFixedThreadPool(poolSize);
        this.port = port;
    }

    public void run() {
        try {
            var server = new ServerSocket(port);//бронирую порт
            while (!stopped) { //до тех пор, пока сервер не остановили, он принимает в себя запросы
                var socket = server.accept();
                System.out.println("Socket accepted");
                pool.submit(() -> processSocket(socket));//передаем пулу обработку сокета, и теперь остается просто в
                // цикле обрабатывать эти запросы
            }
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
            Thread.sleep(10000);
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
        } catch (IOException|InterruptedException e) {
            //TODO: 24/09/23 log error message
            e.printStackTrace();//catch все exception, тк если пробросить далее, это остановит сервер
        }
    }
}
