package lesson_05.HMopt;

import java.util.Scanner;

public class HM05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = new String[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               if(i != j && array[i] !=null)
                   if (array[i].equalsIgnoreCase(array[j])){
                    array[i]=null;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
