package com.company;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class IndexHandler extends BaseHttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) {
        try {
            String response = "This is index response";
            httpExchange.sendResponseHeaders(200,response.getBytes().length);
            httpExchange.getResponseBody().write(response.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
