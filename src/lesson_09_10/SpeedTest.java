package lesson_09_10;

import java.util.*;

public class SpeedTest {
    public static void main(String[] args) {


//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(10);
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000; i++) {
//            arrayList.add(i);
//        }
//
//        long end = System.currentTimeMillis();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        int a = 10;
//
//
//        System.out.println("Добавление в ArrayList заняло " + (end + start));

//        while (a > 0) {
//            System.out.println("время " + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e){
//                throw new RuntimeException(e);
//            }
//            a--;
//        }

        HashSet<String> strings = new HashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("CCC");
        strings.add("DDD");
        strings.add(null);

        LinkedHashSet<String> strings1 = new LinkedHashSet<>();

        strings1.add("AAA");
        strings1.add("BBB");
        strings1.add("CCC");
        strings1.add("CCC");
        strings1.add("DDD");
        strings1.add(null);

        for (int i = 0; i < 5; i++) {

        }

        for (Iterator<String> iter = strings1.iterator(); iter.hasNext(); ){
            System.out.println(iter.next());
        }
    }

}
