package lesson_02;

public class PrimitivTipes {
    //Так пишется коментарий
    // ctrl+alt+l -- Выравнивание
    //Это точка входа в нашу программу
    public static void main(String[] args) {
        //Типы данных числовые значения полных
        //byte a = 10;
        //short b = 11300;
        //int c = 111110000;
        //long d = 123123121231231L;

        // Задача 1. Дано 3 стороны треугольника a = 60. b = 45. c = 18.
        // Найти периметр
        int a = 60;
        int b = 45;
        int c = 18;
        int x = a + b + c;
        System.out.println(x);

        // Плавующие числа
        //float f = 11.22f;
        //double dd = 123.23;

        // Задача 2. Дано: Есть числа 10, 3 и метод научного тыка.
        // Сравнить длинну переменных float и double после запятой
//        double a1 = 10;
//        double b1 = 3;
//        float f1 = (float) (a1 / b1);
//        double d1 = a1 / b1;
//        System.out.println(f1);
//        System.out.println(d1);

        // Задача 3. Коля получил в школе много двоек и решил закопать свой
        //дневник на 127 метров в глубину. Потом закопал еще на 1 метр

        byte d3 = 127;
        byte result3 = (byte) (d3 + 1);
        System.out.println(result3);

        //
        char c4 = 'a';
        char cc4 = 97;
        System.out.println(c4);
        System.out.println(cc4);
        // Задача 4. Дано: 10 красных и 5 зеленых яблок
        // Верно ли утверждение что красных яблок больше чем зеленых?

        int a4 = 10;
        int b4 = 5;
        boolean d4 = a4 > b4;
        System.out.println(d4);

        //Операторы
        /**Арифметические операторы
         + Складывает значения по обе стороны от оператора
         - Вычитает правый операнд из левого операнда
         * Умножает значения по обе стороны от оператора
         / Оператор деления делит левый операнд на правый операнд
         % Делит левый операнд на правый операнд и возвращает остаток
         ++ Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         -- Декремент - уменьшает значение операнда на 1 х-- постфиксная, --х префиксная
         */
    }
}
