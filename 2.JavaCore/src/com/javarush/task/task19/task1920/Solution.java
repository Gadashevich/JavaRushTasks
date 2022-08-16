package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        TreeSet<String> set = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))
        ) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split(" ");
                String name = split[0];
                Double value = Double.parseDouble(split[1]);
                if (!map.containsKey(split[0])) {
                    map.put(name, value);
                } else {
                    map.put(name, map.get(name) + value);
                }
            }
        } catch (IOException ignore) {
        }

        Double max = Double.MIN_VALUE;

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                set.clear();
                set.add(pair.getKey());
            } else if (pair.getValue().equals(max)) {
                set.add(pair.getKey());
            }
        }

        for (String name : set) {
            System.out.println(name);
        }


    }

}