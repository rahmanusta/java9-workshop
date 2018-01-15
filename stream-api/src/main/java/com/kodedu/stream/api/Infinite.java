package com.kodedu.stream.api;

import java.util.stream.Stream;

public class Infinite {

    public static void main(String[] args) {
        Stream.iterate(1, t -> t + 1)
                .forEach(System.out::println);
    }
}
