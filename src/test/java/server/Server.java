/**
 * Задание 3 от 28.02
 */
package server;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {

       // int portNum = 4446;

        int portNum = Integer.parseInt(System.getProperty("ServerPort"));

        HttpServer server = null;

        try {
            server = HttpServer.create();
            server.bind(new InetSocketAddress(portNum), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpContext context = server.createContext("/", new EchoHendler());

        server.setExecutor(null);
        server.start();
    }


    static class EchoHendler implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> hesders = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + o));


            for (String a : hesders){
                if (a.contains("Hello")){
                    builder.append("Hello to, my friend");
                }
            }
            builder.append("lalalalalala000000000");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200,bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }

}
