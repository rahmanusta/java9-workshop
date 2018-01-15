package com.kodedu.stream.api;

import java.util.stream.Stream;

public class TakeDropWhile {

    public static void main(String[] args) {
        Stream<Integer> oneToHundred = Stream.iterate(1, t -> t <= 100, t -> t + 1);

        oneToHundred
                .dropWhile(e -> e < 20)
                .takeWhile(e -> e < 80)
                .forEach(t -> {
                    System.out.println("t: " + t);
                });
    }
}
