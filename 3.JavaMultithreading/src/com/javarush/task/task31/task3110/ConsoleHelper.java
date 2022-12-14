package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        return console.readLine();
    }


    public static int readInt() throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(console.readLine());
    }


}
