package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
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


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream writer = new FileOutputStream(reader.readLine()))
        {
            writer.write(byteArrayOutputStream.toByteArray());
        } catch (IOException ignore) {
        }

        System.out.println(byteArrayOutputStream);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

