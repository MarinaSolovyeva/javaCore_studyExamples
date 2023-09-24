package StudyExample.Servlets.ThreadPooledServer;

public class HttpServerRunner {
    public static void main(String[] args) {
        var server = new HttpServer(8000, 100); //это же значение используется в Tomcat
        server.run();
    }
}
