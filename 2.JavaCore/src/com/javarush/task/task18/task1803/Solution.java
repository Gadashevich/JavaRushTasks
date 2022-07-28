package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] byteCountArray = new int[256];
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine()))
        {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                byteCountArray[data] ++;
            }
        } catch (IOException e){
        }
            int maxByte = 0;
        for (int byteCount : byteCountArray) {
            if (byteCount > maxByte) {
                maxByte = byteCount;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <byteCountArray.length ; i++) {
            if(byteCountArray[i] == maxByte) {
                list.add(i);
            }
        }
        for (int i = 0; i <list.size() ; i++) {
        System.out.print(list.get(i) + " " );
        }
    }
}
