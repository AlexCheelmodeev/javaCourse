package lesson_09_10.HM09;

import java.util.ArrayList;
import java.util.Scanner;

public class HM04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add("0");
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());
        arrayList.add(0,scanner.next());

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
