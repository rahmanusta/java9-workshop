/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.process.api;

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
                System.out.format("PID: %d Command: %s %n", handle.getPid(), cmd);
            });
        });
    }
}
