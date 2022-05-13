package com.javarush.task.task14.task1417;

public class Ruble extends Money{
    @Override
    public String getCurrencyName() {
        return "RUB";
    }
    public Ruble(double amount) {
        super(amount);
    }
}
