/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.websocket;

import java.io.IOException;
import java.net.URI;
import java.net.http.WebSocket;

/**
 *
 * @author usta
 */
public class WebSocketClient {

    public static void main(String[] args) throws IOException {
        URI uri = URI.create("ws://localhost:8080/merhaba");
        MessageListener messageListener = new MessageListener();
        
        WebSocket webSocket = WebSocket.newBuilder(uri, messageListener)
                .buildAsync()
                .join();
        
        webSocket.request(Long.MAX_VALUE);

    }
}
