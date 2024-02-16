package com.javarush.task.jdk13.task42.task4206;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    int number;
    static Main main = new Main();

    public static void main(String[] args)  {
        System.out.println("Основная работа");


        Callable<Integer> findNumber = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return main.math(2, new Random().nextInt(0,20));
            }

        };


        Callable<Boolean> task = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                return new Main().ch();
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(task);
        service.submit(findNumber);

    }


    public  int math(int a, int b){
        return a+b;
    }

    public boolean ch() {
        if(number > 20){
            System.out.println("Значение превышено");
            return true;
        } else{
            return false;
        }
    }




}
