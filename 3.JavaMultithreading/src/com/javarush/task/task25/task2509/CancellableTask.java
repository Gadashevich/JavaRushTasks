package com.javarush.task.task25.task2509;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public interface CancellableTask<T> extends Callable<T> {
    void cancel() throws IOException;

    RunnableFuture<T> newTask();
}