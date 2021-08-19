package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {


    public static List<MusicBand> musicBands = new ArrayList<>();
    private String name;
    private int year;
    private List<String> groupMembers = new ArrayList<>();


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static Object getBands() {
        return musicBands;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (String member : band1.getGroupMembers()) {
            band2.groupMembers.add(member);
        }
        band1.groupMembers.clear();

    }

    public static void printMembers(MusicBand musicBands) {
        System.out.println("MusicBand{" +
                "members='" + musicBands.getGroupMembers() + '}');
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", groupMembers=" + groupMembers +
                '}';
    }

    public void setGroupMembers(String member) {
        groupMembers.add(member);
    }

    public List<String> getGroupMembers() {
        return this.groupMembers;
    }

    public class GroupMembers {
        private String groupMembers;

        public GroupMembers(String member) {
        }
    }

    public static void shuffleGroupList() {
        Collections.shuffle(musicBands);
    }
}



