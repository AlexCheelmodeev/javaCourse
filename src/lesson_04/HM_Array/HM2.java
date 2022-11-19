package lesson_04.HM_Array;

import java.util.Arrays;
import java.util.Scanner;


public class HM2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int maxNum = array[array.length - 1];
        System.out.println("Максимальное число = " + maxNum);

    }
}

