package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if(number>0){
            multiArray = new int[number][];
            for (int i = 0; i <multiArray.length ; i++) {
                int a = Integer.parseInt(scanner.nextLine());
                multiArray[i] = new int[a];
            }
        }

    }
}
