package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream file1 = new FileInputStream(reader.readLine());
             FileOutputStream file2 = new FileOutputStream(reader.readLine()))
        {
            while(file1.available() > 0) {
                list.add(file1.read());
            }
            Collections.reverse(list);
            for (Integer integer : list) {
                    file2.write(integer);
            }

        } catch( IOException ignore){
        }
    }
}
