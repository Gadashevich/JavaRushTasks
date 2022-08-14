package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        System.setOut(printStream);
        testString.printSomething();
        System.setOut(out);

        String string = byteArrayOutputStream.toString();

        String[] split = string.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        String rez = "";

        if (split[1].equalsIgnoreCase("+")) {
            rez = a + " " +split[1]  +" "+ b + " = " + (a + b);

        } else if (split[1].equalsIgnoreCase("-")) {
            rez = a + " " +split[1]  +" "+ b + " = " + (a - b);
        } else if (split[1].equalsIgnoreCase("*")) {
            rez = a + " " + split[1] +" "+ b + " = " + (a * b);
        }
        System.out.println(rez);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

