package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {


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


