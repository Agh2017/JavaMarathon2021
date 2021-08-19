package day12.task4;

import java.util.ArrayList;
import java.util.List;

/*
*Выполнять в подпапке task4 в day12*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять
* участников. Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния
* групп (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода: transferMembers. Этот
* метод принимает в качестве аргументов два экземпляра класса MusicBand.
*
* В классе MusicBand, реализовать метод
* printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
Проверить состав групп после слияния.

 */
public class Task4 {


    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Ирвин Волков");
        members1.add("Лена Курочкина");

        MusicBand band1 = new MusicBand("Самолет", 1998, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Влад Петров");
        members2.add("Вася Епифеев");

        MusicBand band2 = new MusicBand("Самолет2", 2010, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
