package com.company;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GetMethodHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        Map<String,String> map = new HashMap<>();
        URI uri = httpExchange.getRequestURI();
        String query = uri.getQuery();
        String[] group = query.split("&");
        for (String value : group) {
            String[] param = value.split("=");
            map.put(param[0],param[1]);
        }
        String[] args = {map.get("param1"), map.get("param2")};
        Main.main(args);
        String result = Main.result(args);
        result += "Args 1: " + args[0] + ",Args 2: " + args[1];
        httpExchange.sendResponseHeaders(200,result.getBytes().length);
        httpExchange.getResponseBody().write(result.getBytes());
    }
}
