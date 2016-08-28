package com.kodcu.http2;

import java.net.*;
import java.net.http.*;

/*
    Compile command
    .../jdk-9/bin/javac src/com/kodcu/http2/Http2PostClient.java

    Run command
    .../jdk-9/bin/java -cp src -Djavax.net.ssl.trustStore=keystore/keystore com.kodcu.http2.Http2PostClient
 */
public class Http2PostClient {

    public static void main(String[] args) throws Exception {
        String url = "https://31.210.55.49:8443";
        
        String firstName = "[FIRST NAME]";
        String lastName = "[LAST NAME]";
        String email = "[EMAIL]";
        String password = "1q2w3e4r"; // Should remain like this otherwise server will response with fail message 

        
        String parameters = "firstname=" + firstName + ",lastname=" + lastName + ",email=" + email + ",pass=" + password;
        
        System.out.println("Post Request Send Start");
        
        /* Code goes here */

        System.out.println("Post Request Send End");

        
        System.err.println("Code Execution Completed");
    }
}
