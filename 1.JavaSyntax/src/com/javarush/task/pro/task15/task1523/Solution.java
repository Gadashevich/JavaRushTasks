package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);


        try (OutputStream outputStream = urlConnection.getOutputStream();
             PrintStream stream = new PrintStream(outputStream)) {
            stream.println("hello John");
        }

        try (InputStream inputStream = urlConnection.getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));) {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        }


    }
}

