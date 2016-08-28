/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.websocket;

import java.net.http.WebSocket;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

/**
 *
 * @author usta
 */
public class MessageListener implements WebSocket.Listener {

    @Override
    public void onOpen(WebSocket webSocket) {
        webSocket.sendText("Ali")
                .thenRun(() -> {
//                    webSocket.request(1);
                });
        webSocket.sendText("Ata")
                .thenRun(() -> {
//                    webSocket.request(1);
                });
        webSocket.sendText("Bak")
                .thenRun(() -> {
//                    webSocket.request(1);
                });
    }

    @Override
    public CompletionStage<?> onText(WebSocket webSocket, CharSequence message, WebSocket.MessagePart part) {
        System.out.println("Gelen mesaj: " + message);
        return null;
    }

    @Override
    public void onClose(WebSocket webSocket, Optional<WebSocket.CloseCode> code, String reason) {
        System.out.println("Closed..");
    }

    @Override
    public void onError(WebSocket webSocket, Throwable error) {
        error.printStackTrace();
    }
}
