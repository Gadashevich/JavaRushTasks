package com.javarush.task.pro.task13.task1318;

/*
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int i = month.ordinal() ;
        if( i == 11 ){
            return month.values()[0];
        }
        return month.values()[i+1];
    }

}