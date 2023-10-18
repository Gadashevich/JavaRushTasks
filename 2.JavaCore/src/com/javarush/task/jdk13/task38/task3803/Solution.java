package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> void printFullyQualifiedNames(Class<T> aClass) {
        if (aClass.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = aClass.getAnnotation(PrepareMyTest.class);
            String[] strings = annotation.fullyQualifiedNames();
            Arrays.stream(strings).forEach(System.out::println);
        }
    }

    public static <T> void printValues(Class<T> aClass) {
        if(aClass.isAnnotationPresent(PrepareMyTest.class)){
            PrepareMyTest annotation = aClass.getAnnotation(PrepareMyTest.class);
            Class<?>[] values = annotation.value();
            Arrays.stream(values).map(Class::getSimpleName).forEach(System.out::println);
        }
    }
}
