package Day12;

import java.util.ArrayList;
import java.util.List;

/*
 **Выполнять в подпапке task5в day12
 * Скопировать MusicBand из прошлого задания и
 * доработать - теперь у участника музыкальной группы
 * есть не только имя, но и возраст. Соответственно,
 * теперь под участником понимается не строка, а объект
 * класса MusicArtist. Необходимо реализовать
 * класс MusicArtist и доработать класс
 * MusicBand(создать копию класса) таким образом,
 *  чтобы участники были - объекты класса MusicArtist.
 * После этого, надо сделать то же самое, что и
 * требовалось в 4 задании - слить две группы и проверить
 * состав групп после слияния. Методы для слияния и для
 * вывода участников в консоль необходимо тоже переработать,
 * чтобы они работали с объектами класса MusicArtist.
 * */
public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Lick", 50));
        members1.add(new MusicArtist("Marty Balin", 53));
        members1.add(new MusicArtist("Paul Kantner", 34));
        members1.add(new MusicArtist("Jorma Kaukonen", 35));
        members1.add(new MusicArtist("Jack Casady", 43));
        members1.add(new MusicArtist("Spencer Dryden", 48));

        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon", 35));
        members2.add(new MusicArtist("Paul McCartney", 56));
        members2.add(new MusicArtist("Ringo Starr", 40));
        members2.add(new MusicArtist("George Harrison", 38));

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
