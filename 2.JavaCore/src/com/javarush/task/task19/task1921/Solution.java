package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd M yyyy");
            while (reader.ready()) {
                String line = reader.readLine();
                String name = line.replaceAll("\\d", "").trim();
                String birthday = line.replaceAll("\\D", " ").trim();
                PEOPLE.add(new Person(name, simpleDateFormat.parse(birthday)));
            }
        } catch (Exception e) {
        }
        PEOPLE.forEach(person -> System.out.println(person.getName()+" "+person.getBirthDate()));

    }
}
