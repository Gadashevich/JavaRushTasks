package com.javarush.task.pro.task15.task1508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length ; i++) {
                if(i % 2 == 0){
                    System.out.print(String.valueOf(chars[i]).toLowerCase(Locale.ROOT));
                }else {
                    System.out.print(String.valueOf(chars[i]).toUpperCase(Locale.ROOT));
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

