package com.kodedu.http2;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpHeaders;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import javax.net.ssl.SSLParameters;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;

public class JsonApp {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest
                .newBuilder(URI.create("https://bitbay.net/API/Public/BTC/ticker.json"))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandler.asString());

        int statusCode = httpResponse.statusCode();
        System.out.println(statusCode);;
        HttpClient.Version version = httpResponse.version();
        System.out.println(version);
        HttpHeaders headers = httpResponse.headers();
        Optional<String> s = headers.firstValue("content-type");
        System.out.println(s.get());


        SSLParameters sslParameters = httpResponse.sslParameters();
        String body = httpResponse.body();
        System.out.println(body);
    }

}
