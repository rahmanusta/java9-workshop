
package com.kodedu.taskmanager;


public class Task {

    private String taskName;
    private long pid;

    public Task(ProcessHandle processHandle) {
        taskName = processHandle.info().toString();
        this.pid = processHandle.pid();
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
