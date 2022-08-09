package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        try( FileReader fileReader = new FileReader(args[0]))
        {
        while(fileReader.ready()){
           int read = fileReader.read();
            if(Character.isAlphabetic(read) && read >= 65 && read <= 122 ){
                   count++;
            }
        }

        } catch (IOException ignore){
        }
        System.out.println(count);
    }
}
