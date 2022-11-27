package lesson_09_10.HM10;

import java.util.ArrayList;
import java.util.Scanner;

public class HM01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.next());
        }
        arrayList.remove(2);


        for (int i = arrayList.size()-1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
