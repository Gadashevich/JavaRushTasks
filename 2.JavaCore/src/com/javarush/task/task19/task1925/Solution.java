package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            StringBuilder stringBuilder = new StringBuilder();
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split(" ");
                for (String word : split) {
                    if (word.length() > 6) {
                        stringBuilder.append(word).append(",");
                    }
                }
            }
            writer.write(stringBuilder.toString().replaceAll(",$",""));
        } catch (IOException ignore) {
        }


    }
}
