package lesson_04.mwCIkles;

import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {
        //Вводить с клавиатуры числа.
        //Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
        //-1 должно учитываться в сумме.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа");
        int b = 0;
        while (true){
        int a = scanner.nextInt();
            b = b + a;
            if ( a == -1)
                break;
        }
      System.out.println(b);

    }
}
