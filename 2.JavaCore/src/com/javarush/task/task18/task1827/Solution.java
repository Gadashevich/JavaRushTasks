package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
        ) {
            int maxId = 0;
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String idString = line.substring(0, 8);
                int id = Integer.parseInt(idString.trim());
                if (maxId <= id) {
                    maxId = id + 1;
                }
            }
            if (args.length != 0) {
                if (args[0].equalsIgnoreCase("-c")) {
                    String index = checkLength(String.valueOf(maxId), 8);
                    String productName = checkLength(args[1], 30);
                    String price = checkLength(args[2], 8);
                    String quantity = checkLength(args[3], 4);
                    fileWriter.newLine();
                    fileWriter.write(index + productName + price + quantity);
                }
            }
        }


    }

    private static String checkLength(String string, int limit) {
        StringBuilder builder = new StringBuilder(string);

        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }

}
