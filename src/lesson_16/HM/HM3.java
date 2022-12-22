package lesson_16.HM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
        System.out.println(array[9] + array[10]);
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
        int cur = array[i];
        int j = i;
        while (j > 0 && array[j-1]> cur){
            array[j] = array[j-1];
            j--;
        }
        array[j] = cur;
        }
    }
}

