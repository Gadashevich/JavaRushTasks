package com.javarush.task.task26.task2612;

public class Threads {

    public static void main(String []args) throws InterruptedException {
        Object lock = new Object();
        // task будет ждать, пока его не оповестят через lock
        Runnable task = () -> {
            synchronized(lock) {
                try {
                    lock.wait();
                } catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread");
        };
        Thread taskThread = new Thread(task);
        taskThread.start();
        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
        Thread.currentThread().sleep(3000);
        System.out.println("main");
        synchronized(lock) {
            lock.notify();
        }
    }
}
