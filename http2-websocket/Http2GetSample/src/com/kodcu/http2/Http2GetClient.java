package com.kodcu.http2;

import java.net.*;
import java.net.http.*;

/*
    Compile command
    .../jdk-9/bin/javac src/com/kodcu/http2/Http2GetClient.java

    Run command
    .../jdk-9/bin/java -cp src -Djavax.net.ssl.trustStore=keystore/keystore com.kodcu.http2.Http2GetClient
 */
public class Http2GetClient {

    public static void main(String[] args) throws Exception {
        String url = "https://31.210.55.49:8443";
       
        System.out.println("Get Request Send Start");
        
        /* Code goes here */

        System.out.println("Get Request Send End");
        
        
        System.err.println("Code Execution Completed");
    }
}
