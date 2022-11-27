package lesson_09_10.HM10;

import java.util.ArrayList;

public class HM02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Мама");
        arrayList.add("Мыла");
        arrayList.add("Раму");

        arrayList.add(0, "Именно");
        arrayList.add(2, "Именно");
        arrayList.add(4, "Именно");


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
