
package com.kodcu.websocket;

import jdk.incubator.http.WebSocket;

import java.util.concurrent.CompletionStage;

/**
 * @author usta
 */
public class MessageListener implements WebSocket.Listener {

    private static final boolean LAST = true;

    @Override
    public void onOpen(WebSocket webSocket) {
        webSocket.sendText("Ali", LAST)
                .thenRun(() -> {
//                    webSocket.request(1);
                });
        webSocket.sendText("Ata", LAST)
                .thenRun(() -> {
//                    webSocket.request(1);
                });
        webSocket.sendText("Bak", LAST)
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
    public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
        System.out.println("Closed..");
        return null;
    }

    @Override
    public void onError(WebSocket webSocket, Throwable error) {
        error.printStackTrace();
    }
}
