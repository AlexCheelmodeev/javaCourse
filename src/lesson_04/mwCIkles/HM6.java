package lesson_04.mwCIkles;

import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите год");
        String y = scanner.nextLine();
        System.out.println("Введите месяц");
        String m = scanner.nextLine();
        System.out.println("Введите день");
        String d = scanner.nextLine();
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + y + ('.') + m + '.' + d);
    }
}
