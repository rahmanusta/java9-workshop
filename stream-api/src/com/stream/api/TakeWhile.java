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
public class TakeWhile {

    public static void main(String[] args) {
        Stream<Integer> oneToHundred = Stream.iterate(1, t -> t <= 100, t -> t + 1);

        oneToHundred.takeWhile(t -> t <= 40)
                .forEach(System.out::println);
    }

}
