
package com.kodedu.process.api;

public class ProcessApi {

    public static void main(String[] args) throws Exception {

        ProcessBuilder command = new ProcessBuilder().command("notepad");
        Process process = command.start();
        long pid = process.pid();
        System.out.println("Pid: " + pid);
        Thread.sleep(5000);
        process.destroy();
    }

}
