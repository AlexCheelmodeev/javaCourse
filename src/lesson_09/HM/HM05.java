package lesson_09.HM;

import java.util.ArrayList;
import java.util.Scanner;

public class HM05 {
    public static void main(String[] args) {
        String b;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.next());
        }
        for (int i = 0; i < 13; i++) {
            b = arrayList.get(4);
            arrayList.remove(4);
            arrayList.add(0,b);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
