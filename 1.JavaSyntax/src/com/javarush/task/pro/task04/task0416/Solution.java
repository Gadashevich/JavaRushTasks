package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kola = scanner.nextInt();
        int human = scanner.nextInt();
        double rez = (double) kola / human;
        System.out.println(rez);

    }
}