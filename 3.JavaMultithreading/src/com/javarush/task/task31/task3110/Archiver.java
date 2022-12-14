package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception{

        System.out.print("Введите полный путь архива с именем: ");
        BufferedReader pathArchive = new BufferedReader(new InputStreamReader(System.in));
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(pathArchive.readLine()));
        System.out.println();
        System.out.print("Введите путь к файлу который нужно архивировать: ");
        BufferedReader pathFile = new BufferedReader(new InputStreamReader(System.in));
        zipFileManager.createZip(Paths.get(pathFile.readLine()));


    }
}
