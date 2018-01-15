package com.kodcu.websocket;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.WebSocket;

import java.io.IOException;
import java.net.URI;

/**
 * @author usta
 */
public class WebSocketClient {

    public static void main(String[] args) throws IOException {
        URI uri = URI.create("ws://localhost:8080/merhaba");
        MessageListener messageListener = new MessageListener();

        HttpClient httpClient = HttpClient.newBuilder().build();

        WebSocket webSocket = httpClient.newWebSocketBuilder(uri, messageListener)
                .buildAsync()
                .join();

        webSocket.request(Long.MAX_VALUE);

        System.in.read();

    }
}
