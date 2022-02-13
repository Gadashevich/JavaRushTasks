package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int sum =0;

       while(true){
           String string = scanner.nextLine();
           if(string.equalsIgnoreCase("enter")){
               break;
           }
             sum = sum + Integer.parseInt(string);
       }
       System.out.println(sum);

    }
}