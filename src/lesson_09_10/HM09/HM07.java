package lesson_09_10.HM09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class HM07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listMain.add(i, scanner.nextInt());
            if (listMain.get(i)%3==0 && listMain.get(i)%2==0){
                list1.add(listMain.get(i));
                list2.add(listMain.get(i));
            }
            else if (listMain.get(i) % 3 == 0) {
                list1.add(listMain.get(i));
            } else if (listMain.get(i) % 2 == 0){
                list2.add(listMain.get(i));
            } else {
                list3.add(listMain.get(i));
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list){
        for (Integer i: list){
            System.out.println(i);
        }
    }

}
