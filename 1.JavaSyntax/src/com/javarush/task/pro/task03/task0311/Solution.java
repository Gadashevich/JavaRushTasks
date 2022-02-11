package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        Double one = scanner.nextDouble();
        Double two = scanner.nextDouble();
        if(one == two) {
            System.out.println("числа равны");
        }else {//напишите тут ваш код
            System.out.println("числа не равны");
        }
    }
}
