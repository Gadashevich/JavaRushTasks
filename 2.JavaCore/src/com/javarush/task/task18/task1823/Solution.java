package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

        try( BufferedReader console = new BufferedReader(new InputStreamReader(System.in)))
        {
          while(true){
              String fileName = console.readLine();
                 if (fileName.equalsIgnoreCase("exit")){
                  break;
                }
              new ReadThread(fileName).start();

          }

        } catch(IOException ignore){

        }



    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            Map<Integer,Integer> map = new HashMap<>();
            try( FileInputStream inputStream = new FileInputStream(fileName)){
                      while(inputStream.available() >0){
                          int read = inputStream.read();
                          if(!map.containsKey(read)){
                              map.put(read,1);
                          } else {
                              map.put(read, map.get(read) +1);
                          }
                      }
            } catch (IOException ignore){
            }

            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()) ;
            Comparator<Map.Entry<Integer, Integer>> comparator  = Map.Entry.comparingByValue();
            list.sort(comparator.reversed());

            resultMap.put(fileName,list.get(0).getKey());
        }
    }
}
