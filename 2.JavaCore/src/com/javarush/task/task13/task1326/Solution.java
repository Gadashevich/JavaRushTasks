package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        try ( Scanner scanner = new Scanner(System.in);
              FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
              BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))) {

            while (reader.ready()) {
                int number = Integer.parseInt(reader.readLine().trim());
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
