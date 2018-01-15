package com.kodedu.websocket.server;

import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 *
 * @author usta
 */
@ServerEndpoint("/merhaba")
public class MerhabaSoket {
    
    @OnError
    public void onerror(Throwable thr) {
        thr.printStackTrace();
    }

    @OnMessage
    public void onmessage(Session session, String message) throws IOException {
        session.getBasicRemote().sendText(message);
    }

}
