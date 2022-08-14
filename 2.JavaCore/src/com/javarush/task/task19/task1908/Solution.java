package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split(" ");

                for (int i = 0; i < split.length; i++) {
                    try {
                        int number = Integer.parseInt(split[i]);
                        list.add(number);
                    } catch (NumberFormatException ignore) {
                    }
                }
            }
            for (Integer number : list) {
                writer.write(number+" ");
            }
//
//            list.forEach(integer -> {
//                try {
//                    writer.write(integer);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//

        } catch (IOException ignore) {
        }

    }
}
