package day12.task4;

import day12.task4.MusicBand.GroupMembers;

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
        MusicBand band1 = new MusicBand("Самолет", 1998);
        String member1 = "Ирвин Волков";
        String member2 = "Лена Курочкина";
        band1.setGroupMembers(member1);
        band1.setGroupMembers(member2);
        MusicBand.printMembers(band1);
        MusicBand band2 = new MusicBand("Самолет2", 2010);
        String member3 = "Влад Петров";
        String member4 = "Вася Епифеев";
        band2.setGroupMembers(member3);
        band2.setGroupMembers(member4);
        MusicBand.printMembers(band2);
        MusicBand.transferMembers(band1, band2);
        MusicBand.printMembers(band2);

    }
}
