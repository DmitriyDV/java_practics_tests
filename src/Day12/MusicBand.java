package Day12;

import java.util.List;

public class MusicBand {
    private String name;


    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    private List<MusicArtist> members;

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist member :
                a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

//    public void transfer(MusicBand b){
//        for (String member:
//             this.members) {
//            b.getMembers().add(member);
//        }
//        b.getMembers().clear();
//    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;
}
