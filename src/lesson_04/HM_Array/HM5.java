package lesson_04.HM_Array;

import java.util.Scanner;

public class HM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0;i<20;i++){
            big[i] = sc.nextInt();
        }
        for(int i = 0;i<20;i++){
            small1[i] =big[i];
            small2[i] = big[i + 10];
            System.out.println(small2[i]);
        }

    }
}