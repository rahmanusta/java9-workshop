package com.kodedu.http2.server;

import io.undertow.Undertow;
import io.undertow.UndertowOptions;
import io.undertow.util.Headers;

import javax.net.ssl.*;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.util.Objects;

public class Server {

    public static void main(String[] args) throws Exception {

        Undertow server = Undertow.builder()
                .setServerOption(UndertowOptions.ENABLE_HTTP2, true)
                .addHttpListener(8080, "127.0.0.1")
                .setHandler(exchange -> {

//                    System.out.println("Received: " + exchange.getInputStream().transferTo(System.out));
                    System.out.println("Client address: " + exchange.getConnection().getPeerAddress().toString());

                    exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                    exchange.getRequestReceiver().receiveFullString((e, m) -> {
                        if (Objects.isNull(m)) {
                            e.getResponseSender().send("Hello world!");
                        } else {
                            e.getResponseSender().send(m);
                        }
                    });
                }).build();
        server.start();
    }
}
