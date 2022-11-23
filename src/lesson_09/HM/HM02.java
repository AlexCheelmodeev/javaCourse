package lesson_09.HM;

import java.util.ArrayList;
import java.util.Scanner;

public class HM02 {
    public static void main(String[] args) {
        int l = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.next());
            if (arrayList.get(i).length()> l){
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
