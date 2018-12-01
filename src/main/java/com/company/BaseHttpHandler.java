package com.company;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public abstract class BaseHttpHandler implements HttpHandler {


    @Override
    public abstract void handle(HttpExchange httpExchange) throws IOException;
}
