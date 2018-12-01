package com.company;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HttpApplication {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
            server.createContext("/home", new IndexHandler());
            server.createContext("/gallery", new GalleryIndex());

            /**correct uri /getMethod?param1=In&param2=put*/
            server.createContext("/getMethod", new GetMethodHandler());
            server.setExecutor(null); // default
            System.out.println("Server has been started.");
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
