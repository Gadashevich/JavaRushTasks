package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1])))
        {
            while (reader.ready()){
                String line = reader.readLine();
                String[] split = line.split(" ");
                for (String string : split) {
                    if (string.matches(".*[0-9].*")) {
                        writer.write(string + " ");
                    }
                }


            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
