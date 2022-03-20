package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        try {
        dangerousMethod();
        } catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }

    static void dangerousMethod() throws Exception {
        String s = "Mu-ha-ha!";
        throw new Exception(s);
    }
}
