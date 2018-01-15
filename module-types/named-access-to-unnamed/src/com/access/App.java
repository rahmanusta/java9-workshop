/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.access;

import com.google.gson.Gson;

/**
 *
 * @author usta
 */
public class App {
    
    public static void main(String[] args) {
        
        Book book = new Book();
        book.setName("Java 9 in Action");
        book.setPrice(0);
        book.setAuthor("Rahman Usta");
        
        Gson gson = new Gson();
        String json = gson.toJson(book);
        
        System.out.println(json);
    }
    
}
