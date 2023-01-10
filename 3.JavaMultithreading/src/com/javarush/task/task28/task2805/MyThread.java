package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static AtomicInteger priority = new AtomicInteger(9);

    {
        this.setPriority(priority.incrementAndGet() % 10+1);
//        int newPriority = priority.getAndIncrement();
//        newPriority = getThreadGroup() != null && newPriority > getThreadGroup().getMaxPriority() ? getThreadGroup().getMaxPriority() : newPriority;
//        setPriority(newPriority);
//        if (priority.intValue() > MAX_PRIORITY) {
//            priority.set(1);
//        }
    }


    public MyThread() {
        super();
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);

    }

    public MyThread(Runnable target, String name) {
        super(target, name);

    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);

    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);

    }
}
