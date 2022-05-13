package com.javarush.task.task14.task1417;

public class USD extends Money{
    @Override
    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }
}
