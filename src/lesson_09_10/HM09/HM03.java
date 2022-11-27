package lesson_09_10.HM09;

import java.util.ArrayList;
import java.util.Scanner;

public class HM03 {
    public static void main(String[] args) {
        int l = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.next());
            if (arrayList.get(i).length()< l){
                l = arrayList.get(i).length();;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arrayList.get(i).length() == l){
                System.out.println(arrayList.get(i));
            }
        }

    }
}
