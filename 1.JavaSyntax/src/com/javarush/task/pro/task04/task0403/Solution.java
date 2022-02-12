package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Boolean exit=true;
       int i =0;

       while(exit){
           System.out.println("введите число для сумирования");
           int number = scanner.nextInt();
            i = i+number;
            scanner.nextLine();
           System.out.println("Введите слово ENTER для выхода из программы");
            String stop = scanner.nextLine();
            if(stop.equalsIgnoreCase("enter")){
                exit = false;
                System.out.println(i);
                break;
            }


       }


    }
}