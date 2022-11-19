package lesson_04.HM_Array;
import java.util.Scanner;

public class HM7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];
        int b;
        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt();
        }

            for (int i = 19; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                        int a = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = a;
                    }
                }
            }
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);






    }
}