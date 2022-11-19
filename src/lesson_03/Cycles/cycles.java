package lesson_03.Cycles;

public class cycles {
    public static void main(String[] args) {
        //Циклы
        // fori, whilem foreach

        //fori

        for (int i = 0; i < 5; i++) { // i = i + 1

            System.out.println(i);

        }

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + " ");
            }


        }
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            count += i;
            if (i == 20) {
                System.out.println(i + " ");
            }

        }
        // вывести все числа от 10 до 40, пропустив от 15 до 20
        for (int i = 10; i <= 40; i++) {
            if ((i < 15) || (i > 20)) {
                System.out.print(i + " ");
            }

        }
        // Вывести сумму всех четых чисел от 10 до 50
        int a = 0;
        for (int i = 10; i <= 50 ; i++) {
            if (i % 2 == 0);{
                a +=i;
            }
        }
        System.out.println(" ");
        System.out.print(a + " ");
        System.out.println(" ");



        int counter = 10;
        while (counter >= 0){
            System.out.println("Обратный отчет. Осталось " + counter + " секунд.");
            counter--;
        }


        }
    }





