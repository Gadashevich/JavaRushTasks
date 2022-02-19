package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        array = new int[N];

        for (int i = 0; i <N ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = array[0];

        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
