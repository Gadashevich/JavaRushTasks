package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String line = reader.readLine();
                if (line.equalsIgnoreCase("end")) {
                    break;
                }
                int index = Integer.parseInt(line.substring(line.lastIndexOf(".part") + 5));
                if (!map.containsKey(index)) {
                    map.put(index, line);
                }
            }

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String fileName = entry.getValue();
                String shortName = fileName.substring(0, fileName.lastIndexOf("."));
                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
                     BufferedOutputStream outputStream = new BufferedOutputStream( new FileOutputStream(shortName))) {
                    while (inputStream.available() > 0) {
                        int read = inputStream.read();
                        outputStream.write(read);
                    }
                }
            }


        } catch (IOException e) {
        }

    }
}
