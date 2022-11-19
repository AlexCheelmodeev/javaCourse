package lesson_06.box_with_discks;

public class Box {
    public static void main(String[] args) {
        DiskAudio disk1 = new DiskAudio("Taxi", 1994, "Boyarskiy", 3);
        DiskAudio disk2 = new DiskAudio("2004", 2019, "Skriptonit", 16);

        DiskVideo disk3 = new DiskVideo("Avagers", 2009, "marvel" , "tarantino", 110);
        DiskVideo disk4 = new DiskVideo("Titanik", 1995, "Mosfilm","Ya",142);

        Disk [] box = new Disk[4];
        box[0] = disk1;
        box[1] = disk2;
        box[2] = disk3;
        box[3] = disk4;

        for (int i = 0; i < box.length; i++) {
            box[i].printAllInfo();
        }

    }
}
