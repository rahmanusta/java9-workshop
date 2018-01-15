package com.kodedu.stream.api;

import java.util.stream.Stream;

public class TakeWhile {

    public static void main(String[] args) {
        Stream<Integer> oneToHundred = Stream.iterate(1, t -> t <= 100, t -> t + 1);

        oneToHundred.takeWhile(t -> t <= 40)
                .forEach(System.out::println);
    }

}
