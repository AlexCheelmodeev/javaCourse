package lesson_06.box_with_discks;

public class DiskAudio extends Disk{
    // Поля
   // private String name;
    private String singer;
   // private int year;
    private int CountOfTracks;



    // Конструктор

    public DiskAudio(String name, int year) {
        super(name, year);
    }

    @Override
    public void printAllInfo() {

    }

    public DiskAudio(String name, int year, String singer, int countOfTracks) {
        super(name, year);
        this.singer = singer;
        CountOfTracks = countOfTracks;
    }
//Методы


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountOfTracks() {
        return CountOfTracks;
    }

    public void setCountOfTracks(int countOfTracks) {
        CountOfTracks = countOfTracks;
    }
}

