/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.taskmanager;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author usta
 */
public class TaskManager {

    public List<ProcessHandle> processList() {
        return ProcessHandle.allProcesses()
                .collect(Collectors.toList());
    }

    public void killProcess(ProcessHandle processHandle) {
        processHandle.destroy();
    }

    public void killProcess(long pid) {

        ProcessHandle.of(pid)
                .ifPresent(this::killProcess);
    }

}
