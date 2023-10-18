package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

import org.apache.commons.lang3.ObjectUtils;


public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        if (ObjectUtils.allNotNull(studentOne, studentTwo)) {
            int score = ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
            score += ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());
            score += ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
            score += ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
            score += ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
            score += ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
            score += ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());
            if (score > 0) {

                return "%s has a higher grades score".formatted(studentOne.getName());
            } else if (score < 0) {
                return "%s has a higher grades score".formatted(studentTwo.getName());
            } else {
                return "Student grades scores are equal";
            }

        } else {
            return "Make sure there are no null objects";
        }
    }
}


