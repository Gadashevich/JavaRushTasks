package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {

        try( BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream outputStream = new FileOutputStream(console.readLine(),true);
             BufferedReader inputStream = new BufferedReader(new FileReader(console.readLine()));
             BufferedReader inputStream2 = new BufferedReader(new FileReader(console.readLine())))
        {
            while(inputStream.ready()) {
                String read = inputStream.readLine();
                outputStream.write(read.getBytes());
            }

            while(inputStream2.ready()) {
                String read = inputStream2.readLine();
                outputStream.write(read.getBytes());
            }

        } catch (IOException ignore){
        }

    }
}
