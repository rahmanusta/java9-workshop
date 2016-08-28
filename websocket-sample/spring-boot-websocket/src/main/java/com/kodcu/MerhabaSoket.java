/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu;

import java.io.IOException;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

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
