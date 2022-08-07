package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        Map<String, String> map = new LinkedHashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.ready()) {
                String string = bufferedReader.readLine();
                String index = string.substring(0, 8).trim();
                String substring = string.substring(8);
                if (!map.containsKey(index)) {
                    map.put(index, substring);
                }
            }


            if (args.length != 0) {
                if (args[0].equalsIgnoreCase("-u")) {
                    String id = args[1].trim();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if(entry.getKey().equalsIgnoreCase(id)) {
                            map.put(id, checkLength(args[2], 30) +
                                    checkLength(args[3], 8) +
                                    checkLength(args[4], 4));

                        }
                    }
                    
                } else if (args[0].equalsIgnoreCase("-d")) {
                    String id = args[1].trim();
                    map.entrySet().removeIf(entry -> entry.getKey().equalsIgnoreCase(id));
                }
            }



        }
        try (  BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                    fileWriter.write(checkLength(entry.getKey(),8)+entry.getValue());
                    fileWriter.newLine();
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
