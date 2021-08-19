package day12.task3;

/*
Выполнять в подпапке task3 в day12
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
Создать 10 или более экземпляров класса MusicBand
, добавить их в список (выбирайте такие музыкальные группы, которые
были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после
2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп. Вывести в
консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task3 {

    private static final int AMOUNT = 11;
    private static final int BORDER = 2000;
    private static List<MusicBand> bands2000 = new ArrayList<>();
    public static List<MusicBand> musicBands = new ArrayList<>();

    public static void main(String[] args) {
        makeBands();
        shuffleGroupList();
        System.out.println(getBands());
        groupsAfter2000(musicBands);
        System.out.println("группы, основанные после 2000 года: " + bands2000);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        for (MusicBand band : musicBands) {
            if (band.getYear() > BORDER) {
                bands2000.add(band);
            }
        }
        return bands2000;
    }

    public static void makeBands() {
        String[] groupList = {"Aerosmith", "1973", "Ace of Base", "1992", "Backstreet Boys", "1993", "Bad Boys Blue", "1984", "Gorg", "2020", "Hi-Fi", "1998", "Kamelot", "1991", "Pink Floyd", "1965", "Ленинград", "1996", "Airbourne", "2003", "Cellar Darling", "2016"};

        for (int i = 0, j = 0; i < AMOUNT - 1; i++, j += 2) {
            int year = Integer.parseInt(groupList[j + 1]);
            MusicBand band = new MusicBand(groupList[j], year);
            musicBands.add(i, band);
        }
    }

    public static Object getBands() {
        return musicBands;
    }

    public static void shuffleGroupList() {
        Collections.shuffle(musicBands);
    }

}