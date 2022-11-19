package lesson_03;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
import java.util.zip.Deflater;

public class primitiveTipes02 {
    public static void main(String[] args) {
        /**
         ==  Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным  (A == B) – не верны

         !=  Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным  (A != B) – значение истинна

         >  Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным  (A > B) – не верны

         <  Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным  (A < B) – значение истинна

         >=  Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным  (A >= B) – значение не верны

         <=  Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным  (A <= B) – значение истинна
         * */

       // int a = 5;
       // int b = 5;

      //  boolean c = a == b;
      //  boolean d = a != b;
      //  System.out.println(c);
      //  System.out.println(d);

        /**
         Логические операторы

         &&  Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||  Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !  Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         */

        /** int w = 1;
         int x = w++; // w= w + 1;
         int t = ++w;
         System.out.println(w);
         System.out.println(x);
         System.out.println(t);
         */

        // char a3 = 'a';
        //a3++;


      //  int a4 = 10;
       // int b4 = 25;
       // int c4 = 0;
      //  c4 += a4; // c = c+ a;
      //  c4 += b4; // c = c + b;
      //  System.out.println(c4);


       // boolean a1 = true;

       // boolean b1 = false;

       // System.out.println(a1 && b1);

       // int a6 = 5;
       // int b3 = 6;
//
        //boolean f = (a6 > b3) || (b3 >=a6);

        //boolean d4 = (!a6 && b3) || (a6 && b3);


        /**
         if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else {
         //действие(-я), которые выполняются, если условие истинно;
         }*/

        int a = 25;
        int b = 10;

        boolean c = b > a;

        if (c){
            System.out.println("B больше А");
        } else if (a == b) {
            System.out.println("A ровна B");
        } else {
            System.out.println("A больше B");
        }

        int rate = 2;

        if (rate == 5){
            System.out.println("+++");}
        else if (rate == 4){
            System.out.println("++");}
        else if (rate == 3) {
            System.out.println("+");}
        else {
            System.out.println("-");
        }

        /**

         switch (ВыражениеДляВыбора) {
                case (Значение1):
                     Код1;
                     break;
                case (Значение2):
                    Код2;
                    break;
                    ...
                case (ЗначениеN):
                    КодN;
                    break;
                default:
                КодВыбораПоУмолчанию;
                break;
         }
         * */

        /**switch (rate){
            case (5) :
                System.out.println("Отличник");
                break;
            case (4) :
                System.out.println("Хорошист");
                break;
            case (3) :
                System.out.println("Троешник");
                break;
            case (2) :
                System.out.println("Двошник");
                break;
            default:
                System.out.println("Учится хуже");
                break;
        }*/
       /** Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        switch (h) {
            case  (1) :
                System.out.println("Понедельник");
                break;
            case  (2):
                System.out.println("Вторник");
                break;
            case  (3) :
                System.out.println("Среда");
                break;
            case  (4):
                System.out.println("Четверг");
                break;
            case  (5) :
                System.out.println("Пятница");
                break;
            case  (6):
                System.out.println("Суббота");
                break;
            case  (7) :
                System.out.println("Восскресенье");
                break;
            default:
                System.out.println("Нет такого дня недели"); */
        }
        //Задача 1. Нужно проверить, попадает ли число, которое мы подаем в консоль в диапазон с 100 до 500

        Scanner scanner = new Scanner(System.in);
    int h =scanner.nextInt();
    //if (h >= )

}
