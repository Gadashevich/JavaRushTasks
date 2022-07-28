package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {

                int maxByte = 0;
            while(inputStream.available() > 0) {
                int read = inputStream.read();
                if (maxByte < read) {
                    maxByte = read;
                }
            }
            System.out.println(maxByte);
        } catch (IOException e) {
        }
    }
}