package lesson_05.HMopt;


import java.io.IOException;

import java.util.Scanner;

public class HM02 {
    public static void main(String[] args) {
        String [] array = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length() > array[j].length()){
                    String x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        System.out.println("Тут самое большое число символов "+array[0].length());
        System.out.println("Тут самое маленькое число символов "+array[4].length());
    }
}
