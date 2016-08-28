/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stream.api;

import java.util.stream.Stream;

/**
 *
 * @author usta
 */
public class Infinite {

    public static void main(String[] args) {
        Stream.iterate(1, t -> t + 1)
                .forEach(System.out::println);
    }
}
