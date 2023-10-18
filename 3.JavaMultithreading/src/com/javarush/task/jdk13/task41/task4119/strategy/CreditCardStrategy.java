package com.javarush.task.jdk13.task41.task4119.strategy;

import com.javarush.task.jdk13.task41.task4119.customer.Customer;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private int cvv;
    private LocalDate expiryDate;

    public CreditCardStrategy(Customer custumer) {
        name = custumer.getName();
        cardNumber = custumer.getCardNumber();
        cvv = custumer.getCardCvv();
        expiryDate = custumer.getCardExpiryDate();
    }

    @Override
    public void pay(int amount) {
// много важного кода
        System.out.printf("Оплачено товаров на $%d кредитной картой %s.\n", amount, cardNumber);
    }
}
