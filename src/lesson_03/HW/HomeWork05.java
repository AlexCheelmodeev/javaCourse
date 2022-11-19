package lesson_03.HW;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        /**
         Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.

         Пример для номера месяца 2:
         зима

         Пример для номера месяца 5:
         весна
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер месяца");
        int h = scanner.nextInt();

        if ((h == 2) || (h == 12) || (h == 1)) {
            System.out.println("Зима");
        } else if ((h == 4) || (h == 5) || (h == 3)) {
            System.out.println("Весна");
        } else if ((h == 7) || (h == 8) || (h == 6)) {
            System.out.println("Лето");
        } else if ((h == 10) || (h == 11) || (h == 9)) {
            System.out.println("Осень");
        } else {
            System.out.println("Не правильно задано число");
        }
    }
}