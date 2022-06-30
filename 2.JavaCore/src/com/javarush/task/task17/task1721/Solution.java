package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader firstReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader secondReader = new BufferedReader(new FileReader(reader.readLine())))
        {
//            allLines = Files.readAllLines(Path.of(reader.readLine()));
//            forRemoveLines = Files.readAllLines(Path.of(reader.readLine()));
            while(firstReader.ready()) {
                allLines.add(firstReader.readLine());
            }
            while(secondReader.ready()) {
                forRemoveLines.add(secondReader.readLine());
            }
             new Solution().joinData();
        } catch (IOException ignore){
        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else{
            allLines.clear();
            throw new CorruptedDataException();


        }

    }
}
