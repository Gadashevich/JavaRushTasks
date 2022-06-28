package com.javarush.task.task17.task1714;

/*
Comparable
*/
import java.util.ArrayList;
import java.util.List;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество


    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("beachOne",200.0f,10);
        Beach beach2 = new Beach("beachTwo",200.0f,15);
        Beach beach3 = new Beach("beachThree",300.0f,5);
        Beach beach4 = new Beach("beachFour",300.0f,12);
        Beach beach5 = new Beach("beachFour",100.0f,12);
        Beach beach6 = new Beach("beachFour",150.0f,12);
        Beach beach7 = new Beach("beachFour",50.0f,8);
        Beach beach8 = new Beach("beachFour",350.0f,8);

        List<Beach> listBeach = new ArrayList<>();
        listBeach.add(beach1);
        listBeach.add(beach2);
        listBeach.add(beach3);
        listBeach.add(beach4);
        listBeach.add(beach5);
        listBeach.add(beach6);
        listBeach.add(beach7);
        listBeach.add(beach8);

        for (int i = 0; i <listBeach.size() ; i++) {
            for (int j = 0; j <listBeach.size() ; j++) {
                System.out.println(  listBeach.get(i).compareTo(listBeach.get(j)));
            }
        }
    }

    @Override
    public int compareTo(Beach o) {

        int quality = Integer.compare(getQuality(), o.getQuality());
        int distance = Float.compare(o.getDistance(), getDistance());

        return Integer.compare(quality+distance,0);
    }

    //    @Override
//    public synchronized int compareTo(Beach o) {
//        int sum1 = 0;
//        int sum2 = 0;
//
//        int deltaQuality = this.getQuality() - o.getQuality();
//        if (deltaQuality > 0) {
//            sum1++;
//        } else if (deltaQuality< 0){
//            sum2++;
//        }
//
//
//        float deltaDistance = this.getDistance() - o.getDistance();
//        if (deltaDistance > 0) {
//            sum2++;
//        } else if(deltaDistance < 0){
//            sum1++;
//        }
//
//
//        return sum2-sum1;
//    }
}
