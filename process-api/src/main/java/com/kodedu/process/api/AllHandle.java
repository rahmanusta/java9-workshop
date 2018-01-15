package com.kodedu.process.api;

import java.util.stream.Stream;

/**
 *
 * @author usta
 * Komut bilgisi erisilebilir olan tum process'lerin id'sini ve komut adini tek tek ciktilar.
 */
public class AllHandle {
    public static void main(String[] args) {
        
        Stream<ProcessHandle> allProcesses = ProcessHandle.allProcesses();
        
        allProcesses.forEach(handle -> {
            ProcessHandle.Info info = handle.info();
            info.command().ifPresent(cmd -> {
                System.out.format("PID: %d Command: %s %n", handle.pid(), cmd);
            });
        });
    }
}
