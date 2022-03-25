package com.javarush.task.pro.task15.task1505;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Что-то не копируется...
*/

public class Solution {
    public static void main(String[] args) {



        try(Scanner scanner = new Scanner(System.in);
            InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
            OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0){
                int read = inputStream.read(buffer);
                outputStream.write(buffer,0, read);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}