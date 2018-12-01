package com.company;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class GalleryIndex  extends BaseHttpHandler{

    @Override
    public void handle(HttpExchange httpExchange) {
        try {
            String response = "This is gallery response";
            httpExchange.sendResponseHeaders(200,response.getBytes().length);
            httpExchange.getResponseBody().write(response.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
