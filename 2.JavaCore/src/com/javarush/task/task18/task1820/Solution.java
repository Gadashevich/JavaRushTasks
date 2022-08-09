package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (BufferedReader readerFileOne = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))
        ) {
            while (readerFileOne.ready()) {
                String line = readerFileOne.readLine();
                String[] strings = line.split(" ");
                for (String string : strings) {
                    int round = (int) Math.round(Double.parseDouble(string));
                    writer.write(round + " ");
                }
                writer.newLine();
            }

        } catch (IOException ignore) {

        }


    }
}
