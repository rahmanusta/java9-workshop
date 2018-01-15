
package com.kodedu.process.api;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

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
        
        long pid = processHandle.pid();
        
        ProcessHandle.Info info = processHandle.info();
        Optional<String> command = info.command();
        Optional<String[]> arguments = info.arguments();
        Optional<Instant> startInstant = info.startInstant();
        Optional<Duration> totalCpuDuration = info.totalCpuDuration();
        Optional<String> user = info.user();

    }

}
