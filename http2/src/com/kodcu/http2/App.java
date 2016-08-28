/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.http2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author usta
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpResponse response = HttpRequest
                .create(URI.create("https://istanbul-jug.org"))
                .GET()
                .response();

        System.out.println(response.body(HttpResponse.asString()));

    }
}
