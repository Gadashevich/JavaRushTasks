package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while(reader.ready()){
                String line = reader.readLine();
                String[] split = line.split(" ");
                int count = 0;
                for (String s : split) {
                    if (words.contains(s)) {
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(line);
                }
            }


        } catch (IOException ignore) {
        }

    }
}
