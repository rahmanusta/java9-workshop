/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.taskmanager.ui;

/**
 *
 * @author usta
 */
public class Task {

    private String taskName;
    private long pid;

    public Task(ProcessHandle processHandle) {
        taskName = processHandle.info().toString();
        this.pid = processHandle.getPid();
    }

    public Task(String taskName, long pid) {
        this.taskName = taskName;
        this.pid = pid;
    }

    public String getTaskName() {
        return taskName;
    }

    public long getPid() {
        return pid;
    }
    
    

    @Override
    public String toString() {
        return "Task{" + "taskName=" + taskName + ", pid=" + pid + '}';
    }

}
