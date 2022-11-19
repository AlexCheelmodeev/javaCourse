package lesson_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metods {
    public static void main(String[] args) {
        /**
         Методы-
         Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы. Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;
         Формула создания метода-
         1- модификатор доступа - это одно из 4-х видов слов, указывается перед методом или классом: public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);
         protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте; - будет доступен только внутри текущего пакета (текущей папки);
         private - только внутри текущего класса (файла);
         -Статичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
         -Возвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;
         4 - Название метода: поясняющее его суть, с моленькай буквы;
         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
         6 - тело метода (то что должно происходить, когда метод вызовут);
         public static void         printMassiveToConsole(int[][] mass)
         Модификаторы доступа метода      Сигнатура метода
         * */
        Util util = new Util();
        util.print();

        Util.print1();

        int summa = util.getSumma();


        Contact vasya = new Contact("Вася", "+09421412", "dsDA@mail.com");
        Contact vika = new Contact("Вика", "+0924124412", "dsDA@mail.com");
        Contact lesha = new Contact("Леша", "+0421421412", "dsDA@mail.com");
        Contact katya = new Contact("Катя", "+669421412", "dsDA@mail.com");
        Contact sasha = new Contact("Саша", "+0942131412", "dsDA@mail.com");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(vika);
        phoneBook.addContact(katya);
        phoneBook.addContact(lesha);
        phoneBook.addContact(sasha);

        System.out.println(vasya.getName());





        }


    }


