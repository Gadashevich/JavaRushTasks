package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
//            while (bufferedReader.ready()) {
//                String line = bufferedReader.readLine();
//                char[] chars = line.toCharArray();
//                for (int i = 0; i < chars.length; i++) {
//                    if (chars[i] == '.') {
//                        chars[i] = '!';
//                    }
//                }
//                bufferedWriter.write(chars);
//                bufferedWriter.newLine();
//            }
            while ((bufferedReader.ready())) {
                // String line = bufferedReader.readLine();

                bufferedWriter.write(bufferedReader.readLine().replaceAll("\\.", "!"));
                bufferedWriter.newLine();
            }


        } catch (IOException ignore) {

        }

    }
}
