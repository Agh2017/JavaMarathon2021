package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {

    private static final int AMOUNT = 11;
    public static List<MusicBand> musicBands = new ArrayList<>();
    private String name;
    private int year;



    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static Object getBands() {
        return musicBands;
    }

    public int getYear() {
        return year;
    }

    public static void makeBands() {
        String[] groupList = {"Aerosmith", "1973", "Ace of Base", "1992", "Backstreet Boys", "1993", "Bad Boys Blue", "1984", "Gorg", "2020", "Hi-Fi", "1998", "Kamelot", "1991", "Pink Floyd", "1965", "Ленинград", "1996", "Airbourne", "2003", "Cellar Darling", "2016"};

        for (int i=0, j=0; i<AMOUNT-1; i++, j+=2) {
            int year = Integer.parseInt (groupList[j+1]);
            MusicBand band = new MusicBand(groupList[j], year);
            musicBands.add(i,band);
        }
    }

    public static void shuffleGroupList() {
        Collections.shuffle(musicBands);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}


