package lesson_09_10.HM10;

import java.util.ArrayList;
import java.util.Scanner;

public class HM04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.next());
        }

        arrayList = doubleValues(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

    public static ArrayList<String> doubleValues (ArrayList<String> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(i,arrayList.get(i));
            i++;
        } return arrayList;
    }
}

