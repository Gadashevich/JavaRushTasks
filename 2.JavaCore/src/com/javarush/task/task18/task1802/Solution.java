package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            int minByte = Integer.MAX_VALUE;
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                if (minByte > read) {
                    minByte = read;
                }
            }
            System.out.println(minByte);
        } catch (IOException e) {

        }

    }
}
