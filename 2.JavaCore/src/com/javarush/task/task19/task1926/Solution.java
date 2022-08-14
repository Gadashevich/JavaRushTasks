package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine())))
        {
            while(reader.ready()){
                String line = reader.readLine();
              //  System.out.println(new StringBuilder(reader.readLine()).reverse());

                StringBuilder stringBuilder = new StringBuilder(line);
                StringBuilder reverse = stringBuilder.reverse();
                System.out.println(reverse);
            }

        }catch (IOException e){

        }
    }
}
