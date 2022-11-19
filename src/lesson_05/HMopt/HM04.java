package lesson_05.HMopt;

import java.util.Scanner;

public class HM04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] intarray = new int[10];
        int x = 0;
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            intarray[i] = array[i].length();
        }

        for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
    }
}
