package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        try (BufferedReader console = new BufferedReader(new FileReader(args[0]))) {
            while (console.ready()) {
                String line = console.readLine();
                String[] strings = line.split(" ");
                String name = strings[0];
                Double value = Double.parseDouble(strings[1]);
                if (!map.containsKey(name)) {
                    map.put(name, value);
                } else {
                    map.put(name, map.get(name) + value);
                }
            }
        } catch (IOException ignore) {
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey()+" "+ pair.getValue());
        }

    }
}
