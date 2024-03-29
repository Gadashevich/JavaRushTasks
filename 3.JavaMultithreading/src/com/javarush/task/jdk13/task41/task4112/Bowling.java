package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bowling {

    private final Queue<Track> tracks = new ConcurrentLinkedQueue<>();
    private final Queue<PairOfShoes> shoesShelf = new ConcurrentLinkedQueue<>();

    public Bowling(int tracksNumber) {

//        for (int i = 1; i <=tracksNumber ; i++) {
//            Track track = new Track(i);
//            tracks.add(track);
//        }

        //    IntStream.range(1,tracksNumber+1).mapToObj(Track::new).forEach(tracks::offer);
        //      IntStream.range(1,tracksNumber+1).mapToObj(Track::new).collect(Collectors.toCollection(ConcurrentLinkedQueue::new));

        IntStream.range(1, tracksNumber + 1).forEach(i -> tracks.add(new Track(i)));

        IntStream.range(0, 50).forEach(i -> shoesShelf.offer(new PairOfShoes(ThreadLocalRandom.current().nextInt(38, 46))));


    }

    public synchronized Track acquireTrack() {
        if (tracks.isEmpty()) {
            return null;
        }

        Track track = tracks.poll();
        if (Objects.nonNull(track)) {
            track.setPrice(100 - tracks.size() * 10);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.offer(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) {
            return null;
        }
//        Set<PairOfShoes> shoes = new HashSet<>();
//        for (int i = 0; i < number; i++) {
//            shoes.add(shoesShelf.poll());
//        }
        Set<PairOfShoes> collect = IntStream.range(0, number).mapToObj(i -> shoesShelf.poll()).collect(Collectors.toSet());
        return collect;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}
