package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        File files = new File(root);
        for (File file : files.listFiles()) {

            list.add(file.getName());
            System.out.println(file.getName());
        }
        return list;

    }

    public static void main(String[] args) throws IOException{

        getFileTree("C:\\Users\\Computer\\Documents\\Diablo IV");

    }
}
