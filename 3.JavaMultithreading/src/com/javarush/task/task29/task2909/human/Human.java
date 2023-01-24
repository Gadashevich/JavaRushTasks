package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive{
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;

    protected Size size;

    private BloodGroup bloodGroup;
    private List<Human> children = new ArrayList<>();

    public void setBloodGroup(BloodGroup code) {
        this.bloodGroup = code;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human) {
        children.add(human);
    }

    public void removeChild(Human human) {
        children.remove(human);
    }

   public String getPosition(){
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

    public int getId() {
        return id;
    }


    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    @Override
    public void live() {
        
    }

    public static class Size{
        public int height;
        public int weight;
    }

}