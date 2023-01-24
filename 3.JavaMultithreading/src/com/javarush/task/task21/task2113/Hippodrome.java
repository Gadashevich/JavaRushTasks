package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return this.horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Black", 3, 0));
        horses.add(new Horse("Brown", 3, 0));
        horses.add(new Horse("White", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }


    }

    void move() {
        for (Horse hors : horses) {
            hors.move();
        }
    }

    void print() {
        IntStream.range(0, horses.size()).forEach(i -> horses.get(i).print());

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        return horses.stream().max(Comparator.comparingDouble(Horse::getDistance)).get();
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


}

