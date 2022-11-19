package lesson_02;

public class HomeWork2_3 {
    public static void main(String[] args) {
        //Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        //насколько быстрее голодный Вася съедает один банан?
        //Вывести на консоль
        int hungryoverall = 9;
        int wellfedoverall = 15;
        int bananas = 3;
        int result3 = (wellfedoverall - hungryoverall) / bananas;
        System.out.println("На " + result3 + " минут быстрее");
    }
}
