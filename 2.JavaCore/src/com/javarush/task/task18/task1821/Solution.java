package com.javarush.task.task18.task1821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char aChar = (char) fileReader.read();
                if (aChar <= 127 ) {
                    if (!map.containsKey(aChar)) {
                        map.put(aChar, 1);
                    } else {
                        map.put(aChar, map.get(aChar) + 1);
                    }
                }
            }
        } catch (IOException ignore) {
        }
        for (Character character : map.keySet()) {
            System.out.println(character + " " + map.get(character));
        }
        ;

    }
}
