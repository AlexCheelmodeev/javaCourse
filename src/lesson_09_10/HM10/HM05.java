package lesson_09_10.HM10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HM05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }

        ArrayList<Integer> arrayListCopy = new ArrayList<>();
        arrayListCopy.addAll(arrayList);

        for (int i = 0; i < arrayListCopy.size(); i++) {
            for (int j = 0; j < arrayListCopy.size(); j++) {
                if (arrayListCopy.get(i) < arrayListCopy.get(j)){
                    int x = arrayListCopy.get(i);
                    arrayListCopy.set(i, arrayListCopy.get(j));
                    arrayListCopy.set(j, x);
                }
            }
        }
        for (int i = 0; i < arrayListCopy.size(); i++) {
           if (arrayListCopy.get(i) == arrayList.get(i)){}
           else { System.out.println("Первая переменная которая нарушает" + arrayList.get(i));
           break;}
        }


        System.out.println();
    }
}
