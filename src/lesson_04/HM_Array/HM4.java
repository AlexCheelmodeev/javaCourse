package lesson_04.HM_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
