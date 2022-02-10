package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if(one == two && one==three){
            System.out.println(one +" " + two+ " "+ three);
        }
            else  if(one == two){
                System.out.println(one+" "+ two);
            }
            else if(one == three){
                System.out.println(one+" "+ three);
            }
            else if(two == three){
                System.out.println(two+" "+ three);

        }
    }
}

// пройдено
