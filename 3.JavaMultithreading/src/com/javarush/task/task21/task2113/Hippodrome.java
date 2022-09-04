package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    static Hippodrome game ;

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return this.horses;
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Black", 3, 0));
        horses.add(new Horse("Brown", 3, 0));
        horses.add(new Horse("White", 3, 0));
        game = new Hippodrome(horses);
    }

    void run() throws InterruptedException{
        for (int i = 0; i <100 ; i++) {
            move();
            print();
            Thread.sleep(200);
        }


    }
    void move(){
        for (Horse hors : horses) {
            hors.move();
        }
    }
    void print(){

    }





}

