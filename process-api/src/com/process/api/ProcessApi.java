/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.process.api;

import java.io.IOException;

/**
 *
 * @author usta
 */
public class ProcessApi {

    public static void main(String[] args) throws Exception {
        
        ProcessBuilder command = new ProcessBuilder().command("calc");
        Process process = command.start();
        long pid = process.getPid();
        System.out.println("Pid: " + pid);
        Thread.sleep(3000);
        process.destroy();
    }

}
