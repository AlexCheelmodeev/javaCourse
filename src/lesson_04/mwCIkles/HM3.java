package lesson_04.mwCIkles;

import java.util.Scanner;
import java.util.Spliterator;

public class HM3 {
    //Ввести с клавиатуры три числа, вывести на экран среднее из них.
    //Т.е. не самое большое и не самое маленькое.
    //Если все числа равны, вывести любое из них.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b || a > c) {
            System.out.println(a);
        } else if (b > c || b > a) {
            System.out.println(b);
        } else if (c > b || c > a) {
            System.out.println(c);
        } else if (a == b || a == c || b == c) {
            System.out.println(a);}

    }
}








