package lesson_02;
//Задача 5. В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
//Знаки нужно расставить только в строчке, в которой объявляется переменная result.
//Порядок следования переменных в этой строке изменять нельзя.
//Перед каждой переменной должен стоять знак либо плюс, либо минус.
public class HomeWork2_5 {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result = -a + b - c + d;

        System.out.println(result);
    }
}


