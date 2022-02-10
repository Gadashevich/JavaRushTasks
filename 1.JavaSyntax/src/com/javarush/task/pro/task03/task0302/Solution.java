package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
//Решено (для валидации нужно было убрать лишние sout)
        Scanner scanner = new Scanner(System.in);
   //     System.out.print("Введите имя - ");
        String name = scanner.nextLine();
   //     System.out.println();
       // System.out.print("Введите возраст - ");
        int x = scanner.nextInt();

        if (x>=18 && x<=28){
            System.out.println(name+militaryCommissar);
        }



    }
}
