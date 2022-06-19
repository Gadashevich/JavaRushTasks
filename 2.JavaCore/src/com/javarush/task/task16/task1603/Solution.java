package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
       SpecialThread specialThread01 = new SpecialThread();
       SpecialThread specialThread02 = new SpecialThread();
       SpecialThread specialThread03 = new SpecialThread();
       SpecialThread specialThread04 = new SpecialThread();
       SpecialThread specialThread05 = new SpecialThread();

        Thread thread01 = new Thread(specialThread01);
        Thread thread02 = new Thread(specialThread02);
        Thread thread03 = new Thread(specialThread03);
        Thread thread04 = new Thread(specialThread04);
        Thread thread05 = new Thread(specialThread05);

        list.add(thread01);
        list.add(thread02);
        list.add(thread03);
        list.add(thread04);
        list.add(thread05);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }


}
