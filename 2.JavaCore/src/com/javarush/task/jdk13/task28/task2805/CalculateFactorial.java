package com.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.Callable;

public class CalculateFactorial implements Callable<Long> {
  private long number;

    public CalculateFactorial(long number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long result = 1L;
        while (number > 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
