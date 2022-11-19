package lesson_05.HMopt;

import java.util.Scanner;

public class HM03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(array[i]);
        }
    }
}
