package com.javarush.task.task26.task2612;

import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
Весь мир играет комедию
*/

public class Solution extends  Thread {
    private Lock lock = new ReentrantLock();

    public void someMethod() {
        if (lock.tryLock()) {
            try {
                actionIfLockIsFree();
            } finally {
                lock.unlock();
            }
        } else {
            actionIfLockIsBusy();
        }

    }

    public void actionIfLockIsFree()  {
    }

    public void actionIfLockIsBusy() {
    }
}


