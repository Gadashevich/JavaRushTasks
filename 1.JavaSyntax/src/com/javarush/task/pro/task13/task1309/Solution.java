package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Студент_01", 4.3);
        grades.put("Студент_02", 4.2);
        grades.put("Студент_03", 4.5);
        grades.put("Студент_04", 4.1);
        grades.put("Студент_05", 4.7);
    }
}
