package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int spaceCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                builder.append(reader.readLine());
            }
            String string = builder.toString();
            int length = string.length();
            for (char aChar : string.toCharArray()) {
                if (Character.isSpaceChar(aChar)) {
                    spaceCount++;
                }
            }
         if(length > 0){
             System.out.printf("%.2f",(double) spaceCount/ length * 100);

         }
        } catch (IOException ignore) {
        }
    }
}
