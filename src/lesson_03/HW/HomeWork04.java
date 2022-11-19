package lesson_03.HW;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        /**
         Написать программу, которая будет проверять число, которое мы подадим ей.
         Если число положительное, то увеличить его в два раза.
         Если число отрицательное, то прибавить единицу.
         Если введенное число равно нулю, необходимо вывести ноль.
         Вывести результат в консоль*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int h = scanner.nextInt();
        int a = h * 2;
        int b = h + 1;

        if (h > 0) {
            System.out.println(a);
        } else if (h < 0 ) {
            System.out.println(b);
        } else {
            System.out.println(h);
        }
    }
}
