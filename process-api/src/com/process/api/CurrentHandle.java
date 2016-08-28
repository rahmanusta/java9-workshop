/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.process.api;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author usta
 * ProcessHandle#current o anki calisan JVM process'ine dair ProcessHandle nesnesi dondurur.
 * ProcessHandle.Info process'e dair komut, arguman, toplam calisma suresi,
 * calismaya baslangic zamani ve user gibi bilgileri sunar
 */
public class CurrentHandle {

    public static void main(String[] args) {
        
        ProcessHandle processHandle = ProcessHandle.current();
        
        long pid = processHandle.getPid();
        
        ProcessHandle.Info info = processHandle.info();
        Optional<String> command = info.command();
        Optional<String[]> arguments = info.arguments();
        Optional<Instant> startInstant = info.startInstant();
        Optional<Duration> totalCpuDuration = info.totalCpuDuration();
        Optional<String> user = info.user();

    }

}
