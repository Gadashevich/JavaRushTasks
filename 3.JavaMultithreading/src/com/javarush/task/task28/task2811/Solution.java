package com.javarush.task.task28.task2811;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* 
ReentrantReadWriteLock
*/

public class Solution {
    public static void main(String[] args) {
        ReadWriteMap<Integer, String> linkedSafeMap = new ReadWriteMap<>(new ConcurrentHashMap<>());
    }
}
