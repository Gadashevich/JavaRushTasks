package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {

        try(
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine()))
        {
            int half = (file1.available() + 1) / 2;
            int count =0;

            while(file1.available() > 0) {
                if(count < half){
                    file2.write(file1.read());
                    count ++;
                } else {
                    file3.write(file1.read());
                }
            }

        }
        catch (IOException e) {
        }
    }
}
