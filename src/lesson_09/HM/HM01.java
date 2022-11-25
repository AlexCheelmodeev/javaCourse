package lesson_09.HM;

import java.util.ArrayList;

public class HM01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.size());

        for(int i = 0; i < 5; i++){
            System.out.println(arrayList.get(i));
        }
    }
}
