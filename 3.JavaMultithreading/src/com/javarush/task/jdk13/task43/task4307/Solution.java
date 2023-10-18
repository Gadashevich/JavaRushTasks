package com.javarush.task.jdk13.task43.task4307;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.Objects;

/* 
Шило на мыло
*/

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
        //System.out.println(ObjectUtils.firstNonNull(values));
        Arrays.stream(values).filter(Objects::nonNull).findFirst().ifPresent(System.out::println);

    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
//        for (String o : values) {
//           System.out.println(ObjectUtils.defaultIfNull(o, defaultValue));
//        }
//        for (int i = 0; i < values.length ; i++) {
//            System.out.println(Objects.requireNonNullElse(values[i],defaultValue));
//        }

     //   Arrays.stream(values).map(e -> Objects.requireNonNullElse(e,defaultValue)).forEach(System.out::println);
        Arrays.stream(values).forEach(e -> System.out.println(Objects.requireNonNullElse(e,defaultValue)));
    }
}
