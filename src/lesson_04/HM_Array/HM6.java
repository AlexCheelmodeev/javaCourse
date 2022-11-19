package lesson_04.HM_Array;

import java.util.Arrays;
import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        String maxNum = String.valueOf(array[array.length - 1]);
        String minNum = String.valueOf(array[array.length - 20]);
        System.out.println( maxNum + " "+ minNum);
    }
}
