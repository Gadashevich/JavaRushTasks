package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int height =1 ;
        while(height <= 10){
            int weight =1;
            while(weight <= 20){
                if(height==1 || height==10) {
                    System.out.print("Б");
                }else if(weight==1 || weight==20){
                    System.out.print("Б");
                }else{
                    System.out.print(" ");
                }
                weight++;
            }
            height++;
            System.out.println();

        }
    }
}