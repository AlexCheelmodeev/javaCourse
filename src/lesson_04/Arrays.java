package lesson_04;

public class Arrays {
    public static void main(String[] args) {
        //Arrays - Массивы
        //Используем данные одного типа

      /**  int [] array = new int[10];
        int [] array2 = new int[]{1,2,3,4,5};
        int [] array3 = new int [5];
        array3 [0] = 11;
        array3 [1] = 22;
        array3 [2] = 33;
        array3 [3] = 44;
        array3 [4] = 55;
        array3 [5] = 66;
        System.out.println(); */

        int [] array = new int[10];
        for (int i = 0; i < 5; i++){
            array [i] = i + 1;
        }

        // 1. печать кажого ячейка массива


        for (int i= 0; i < 5; i++){
            System.out.println(array[i]);
        }

        //2. печатать только четные элеметны массива

        int [] array2 = new int[100];

                for(int i = 0; i <=100; i++){
                    array2 [i] = i;
                    if (i % 2 == 0) {
                        System.out.print(array2[i] + " ");
                    }
                }
        // 3. заполнить массив не четными цифрами от 10 до 30

        //for (int i = 10; i <= 30; i++) {
        //    if ()

        }
    }

