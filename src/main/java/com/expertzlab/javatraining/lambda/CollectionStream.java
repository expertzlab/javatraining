package com.expertzlab.javatraining.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gireeshbabu on 25/11/16.
 */
public class CollectionStream {

    static ArrayList<Artist> actors = new ArrayList<>();
    static List<Track> tracks;
    static {
        actors.add(new Artist("Raj","London"));
        actors.add(new Artist("Ram","Austria"));
        actors.add(new Artist("Ravi","London"));
         tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));
    }

    public static void main(String[] args) {

        long count = 0;
        /*
        for(Artist artist: actors){
            if(artist.isFrom("London")){
                count++;
            }
        }
        */
        /*
        count = actors.stream().filter(artist -> artist.isFrom("London")).count();
        System.out.println(count);
        */
        /*
        List<String> collected = Stream.of("a", "b", "c")
                .collect(Collectors.toList());

        */

        /*
        List<String> collected = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());
        System.out.println(collected);
        */
        /*
        List<String> beginningWithNumbers
                = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(beginningWithNumbers);
        */
        /*
        List<Integer> together = (List<Integer>) Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
        System.out.println(together);
        */

        /*

        Track shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
        System.out.println(shortestTrack.name);
        */

        /*

        count = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(count);
        */

        /*
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 2, 1));
        List<Integer> sameOrder = numbers.stream()
                .sorted()
                .collect(toList());
        System.out.println(numbers);
        */

        /*
        double val = tracks.stream().collect(Collectors.averagingLong(track -> track.getLength()));
        System.out.println(val);
        */

        /*
        List<Album> album = new ArrayList();

        album.stream()
                .flatMap(Album::getTracks)
                .mapToInt(Track::getLength)
                .sum();

          */
    }

    public static List asList(int a, int b, int... arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);

        if( arr != null && arr.length > 0){
            for(Integer el: arr){
                list.add(el);
            }
        }
        return list;
    }


    public static List asList(Track a, Track b, Track c){
        ArrayList<Track> list = new ArrayList<Track>();
        list.add(a);
        list.add(b);
        return list;
    }

}


class Artist{

    String name;
    String from;
    long count;

    public Artist(String name, String from){
        this.name = name;
        this.from = from;
    }

    public Artist(String name, String from,long count){
        this.name = name;
        this.from = from;
        this.count = count;
    }

    public boolean isFrom(String country){
        if(from.equals(country)) {
            return true;
        }
        return false;
    }

    public long getCount(){
        return count;
    }
}

class Track{

    String name;
    int length;

    public Track(String name, int length){
        this.name = name;
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public String getName(){
        return name;
    }
}

class Album{

    List<Track> tracks = new ArrayList();

    Album(List<Track> tracks){
        this.tracks = tracks;
    }

    public List getTracks(){
        return this.tracks;
    }
}