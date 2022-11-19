package lesson_04.HM_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] string = new String[10];
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            string[i] = reader.readLine();
        }
        for (int i = 0; i < 10; i++) {
            array[i] = string[i].length();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
