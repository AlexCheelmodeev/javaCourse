package lesson_09;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int a = 10;


        System.out.println("Добавление в ArrayList заняло " + (end + start));

//        while (a > 0) {
//            System.out.println("время " + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e){
//                throw new RuntimeException(e);
//            }
//            a--;
//        }
    }

}
