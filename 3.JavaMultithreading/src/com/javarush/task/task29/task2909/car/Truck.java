package com.javarush.task.task29.task2909.car;

public class Truck extends  Car{
   private final static int MAX_TRUCK_SPEED = 80;
    public Truck( int numberOfPassengers) {
        super(TRUCK, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
