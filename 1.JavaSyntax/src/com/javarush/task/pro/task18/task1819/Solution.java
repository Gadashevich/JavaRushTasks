package com.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
//        for (String s : list) {
//            Optional<String> str = Optional.ofNullable(s);
//            System.out.println(str.orElse(text));
//        }
        list.forEach(e -> System.out.println(Optional.ofNullable(e).orElse(text)));
//            list.stream().map(e -> Optional.ofNullable(e).orElse(text)).forEach(System.out::println);
    }
}
