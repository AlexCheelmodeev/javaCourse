package lesson_09_10.tern_operator;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        People people = new People("Vasya", 17);

//        if (people.getAge()< 16){
//            System.out.println("Нет." + people.getName()+ " Ты не сможешь пройти") ;
//        } else {System.out.println("Да." + people.getName()+ " Проходи") ;}

        String answer = people.getAge() < 16 ?
                "Нет." + people.getName()+ " Ты не сможешь пройти"
                :
                "Да." + people.getName()+ " Проходи";

        System.out.println(answer);


        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });//(new ReverseIntegers());

        treeSet.add(11);
        treeSet.add(22);
        treeSet.add(33);
        treeSet.add(44);
        treeSet.add(77);
        treeSet.add(1);
        treeSet.add(77);


        TreeSet<String > treeSet1 = new TreeSet<>();

        treeSet1.add("AAA");
        treeSet1.add("BBB");
        treeSet1.add("CCC");
        treeSet1.add("DDD");
        treeSet1.add("aaa");
        treeSet1.add("bbb");


    }
}
