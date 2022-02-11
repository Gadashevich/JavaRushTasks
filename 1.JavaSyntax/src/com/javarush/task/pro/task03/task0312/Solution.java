package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        if (x.equals(y)) {
            System.out.println("строки одинаковые");
        } else {//напишите тут ваш код
            System.out.println("строки разные");

        }
    }
}
