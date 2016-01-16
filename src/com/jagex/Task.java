package com.jagex;

public class Task {

    public static final int TASK_PENDING = 0;
    public static final int TASK_SUCCESS = 1;
    public static final int TASK_FAILED  = 2;

    public volatile Object result;
    public int intArg; //set as ip, task priority, port
    public volatile int resultStatus = 0;
    Task next;
    int taskId;
    Object target; //set as url, host, string url, runnable


}
