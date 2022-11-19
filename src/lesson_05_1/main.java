package lesson_05_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < args.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
