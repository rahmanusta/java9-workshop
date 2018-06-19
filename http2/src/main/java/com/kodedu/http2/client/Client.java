package com.kodedu.http2.client;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        var httpClient = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080")).GET().build();

        var httpResponse = httpClient.send(request, HttpResponse.BodyHandler.asString());

        String body = httpResponse.body();
        int statusCode = httpResponse.statusCode();
        HttpClient.Version version = httpResponse.version();

        System.out.println(version);



    }
}
