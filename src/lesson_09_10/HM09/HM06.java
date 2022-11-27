package lesson_09_10.HM09;

import java.util.ArrayList;
import java.util.Scanner;

public class HM06 {
    public static void main(String[] args) {
        int l = 0;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, scanner.next());
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(l).length() < arrayList.get(i).length()) {
                l = i;
            }
            if (arrayList.get(s).length() > arrayList.get(i).length()) {
                s = i;
            }
        }
        if (l < s) {
            System.out.println(arrayList.get(l));
        } else
            System.out.println(arrayList.get(s));
    }
}
