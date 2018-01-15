package com.kodedu.service.client;

import com.kodedu.random.spi.RandomService;

import java.util.ServiceLoader;

public class App {

    public static void main(String[] args) {

        ServiceLoader<RandomService> randomService = ServiceLoader.load(RandomService.class);
        randomService
                .findFirst()
                .ifPresent(service -> {
                    long number = service.generateNumber(1, 100);
                    System.out.println("Number: " + number);
                });


    }
}
