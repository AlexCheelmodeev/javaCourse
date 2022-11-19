package lesson_05;

import java.util.Scanner;

public class String_Application {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str1 = new String("Hello World");
        for (int i = 0; i < 6; i++) {
            str1 += "!";
        }

        System.out.println(str);
        System.out.println(str1);


        /**
         String !


         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         * */

        int length = str1.length();
        System.out.println(length);

        String str2 = "hello world!";

        boolean equals = str.equals(str1);
        boolean equals1 = str2.equalsIgnoreCase(str);
        System.out.println(equals);
        System.out.println(equals1);

        boolean hello = str2.startsWith("hello");
        boolean world = str2.endsWith("world!");

        System.out.println(hello);
        System.out.println(world);

        String str3 = str2.replace("world", "Russia");
        System.out.println(str3);

        String letter = "hello my dear friend";

        String [] array = letter.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toUpperCase() + " ");
        }

        System.out.println("\n");

        String [] array1 = letter.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array[i].toLowerCase() + " ");
        }

        System.out.println("\n");

        String a = "Hello world ";
        a = letter.trim();
        System.out.println(a);

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int age = scanner.nextInt();

        String city = scanner.nextLine();

        System.out.printf("Меня зовут " + name + "мне " + age + " лет. Я проживаю в городе " + city);
        System.out.println("\n");
        System.out.printf("Меня зовут %s мне %d  лет. Я проживаю в городе ", name, age);
    }
}
