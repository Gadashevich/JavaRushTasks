package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        String b = "Б";
        int x = 0;
        int y = 0;


        while(x<2){
            System.out.println(b.repeat(20));
            while (y<9) {
            System.out.println("Б                  Б");
            // while (y<)
            y++;
        }
            x++;

        }
// можно нарисовать пробелы, но как обойтись без этого? Возможно нужно взять букву Б в цикл

    }
}