package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] strings = line.replaceAll("\\p{P}", " ")
                                       .replaceAll("\\s", " ")
                                       .split(" ");

                for (int i = 0; i < strings.length; i++) {
                    if (strings[i].equalsIgnoreCase("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (IOException ignore) {

        }
    }
}
