package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while(true){
        String x = scanner.nextLine();
        if(x.equalsIgnoreCase("enough")){
            break;
        }else {
            System.out.println(x);
        }

       }

    }
}