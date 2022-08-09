package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] strings = line.split(" ");
            int year = Integer.parseInt(strings[5]);
            int month = Integer.parseInt(strings[4])-1;
            int day = Integer.parseInt(strings[3]);
            Calendar calendar = new GregorianCalendar(year,month,day);
            Date date = calendar.getTime();
           return new Person(strings[1],strings[2],strings[0],date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
