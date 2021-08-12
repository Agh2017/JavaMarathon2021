package day12.task5;

import java.util.ArrayList;
import java.util.List;

/*
*Выполнять в подпапке task5 в day12*
Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя, но
* и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist. Необходимо
* реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом, чтобы участники
* были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две
* группы и проверить состав групп после слияния. Методы для слияния и для вывода участников в консоль необходимо тоже
* переработать, чтобы они работали с объектами класса MusicArtist

 */
public class Task5 {
    public static void main(String[] args) {

        List <MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Ирвин Волков", 1985));
        members.add(new MusicArtist("Лена Курочкина", 1999));
        MusicBand band1 =new MusicBand("Самолет",2010,members);
        List <MusicArtist> members2 = new ArrayList<>();
        members.add(new MusicArtist("Влад Петров", 1978));
        members.add(new MusicArtist("Вася Епифеев", 1979));
        MusicBand band2 =new MusicBand("Аэроплан",2000,members2);
        MusicBand.transferMembers(band1, band2);
        MusicBand.printMembers(band2);

    }
}
