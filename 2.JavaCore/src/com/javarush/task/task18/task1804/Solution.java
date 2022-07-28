package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteCount = new int[256];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                byteCount[data]++;
            }
        } catch (IOException e) {
        }
        int minByte = Integer.MAX_VALUE;
        for (int count : byteCount) {
            if (count > 0 && count < minByte  ) {
                minByte = count;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <byteCount.length ; i++) {
            if(byteCount[i] == minByte){
                list.add(i);
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}
