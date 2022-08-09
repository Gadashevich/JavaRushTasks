package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder builder = new StringBuilder();
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();


            try (BufferedReader file1 = new BufferedReader(new FileReader(fileName1));
                 BufferedReader file2 = new BufferedReader(new FileReader(fileName2));
                 FileOutputStream outputStream = new FileOutputStream(fileName1)) {
                while (file1.ready()) {
                    builder.append(file1.readLine());
                }

                while (file2.ready()) {
                    outputStream.write(file2.readLine().getBytes());
                }

                outputStream.write(builder.toString().getBytes());
            }
        } catch (IOException ignore) {
        }
    }
}