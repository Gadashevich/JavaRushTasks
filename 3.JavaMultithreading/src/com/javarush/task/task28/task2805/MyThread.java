package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static volatile AtomicInteger priority = new AtomicInteger(1);

    private synchronized void priority(){
        int newPriority = priority.getAndIncrement();
        newPriority = getThreadGroup() != null && newPriority > getThreadGroup().getMaxPriority() ? getThreadGroup().getMaxPriority() : newPriority;
        setPriority(newPriority);
        if (priority.intValue() > MAX_PRIORITY) {
            priority.set(1);
        }
    }

    public MyThread() {
        super();
        priority();
    }

    public MyThread(Runnable target) {
        super(target);
        priority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        priority();
    }

    public MyThread(String name) {
        super(name);
        priority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        priority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        priority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        priority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        priority();
    }
}
