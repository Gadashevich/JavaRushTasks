package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();

    Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public static void main(String[] args) {

    }

    public List<Horse> getHorses() {
        return this.horses;
    }
}

