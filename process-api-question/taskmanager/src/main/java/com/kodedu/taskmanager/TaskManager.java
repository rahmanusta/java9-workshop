package com.kodedu.taskmanager;

import java.util.List;
import java.util.stream.Collectors;


public class TaskManager {

    public List<ProcessHandle> processList() {
        return ProcessHandle
                .allProcesses()
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
