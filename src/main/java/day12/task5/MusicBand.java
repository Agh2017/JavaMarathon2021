package day12.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {

    private static final int AMOUNT = 11;
    public static List<MusicBand> musicBands = new ArrayList<>();
    private String name;
    private int year;
    private List<MusicArtist> groupMembers;


    public MusicBand(String name, int year, List<MusicArtist> groupMembers) {
        this.name = name;
        this.year = year;
        this.groupMembers = groupMembers;
    }

    public static Object getBands() {
        return musicBands;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MusicArtist member : band1.getMembers()) {
            band2.groupMembers.add(member);
        }
        band1.groupMembers.clear();

    }

    public int getYear() {
        return year;
    }


    public static void printMembers(MusicBand musicBands) {
        System.out.println("MusicBand{" +
                "members='" + musicBands.getMembers() + '}');
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", groupMembers=" + groupMembers +
                '}';
    }

    public List<MusicArtist> getMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<MusicArtist> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public static void shuffleGroupList() {
        Collections.shuffle(musicBands);
    }


}



