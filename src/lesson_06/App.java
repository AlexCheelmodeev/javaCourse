package lesson_06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik", "black");
        Cat snowball = new Cat("Snowball", 5, 4, "White");
        Cat noname = new Cat();


        //System.out.println(noname.getAge());
        //Dog sharik = new Dog("Sharik", "White",15,24);

        Dog wow = new Dog("Wow", "Blue", 15, 42);
        //System.out.println(murzik.getAge());

        Cat[] site = new Cat[8];
        site[0] = barsik;
        site[1] = murzik;
        site[2] = snowball;
        site[3] = noname;


        System.out.println("Выберите цифру:");
        System.out.println("1. Поиск котика");
        System.out.println("2. Добавление котика");
        System.out.println("3. Удаление котика");
        int num;
        int yn;
        int fname;
        String rdyname;
        int[] array = new int[5];

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num == 1) {  // Поиск кота
            System.out.println("По какому параметру ищем. Укажите цифру:");
            System.out.println("1 Имя");
            System.out.println("2 Цвет");
            fname = scanner.nextInt();
            String rdycolor = null;
            if (fname == 1) { // Поиск кота по имени
                System.out.println("Укажите имя на английском языке:");
                rdyname = scanner.next();
                for (int i = 0; i < 3; i++) {
                    if (site[i].getName().equalsIgnoreCase(rdyname)) {
                        site[i].getAllInfo();
                    }


                }
            } else if (fname == 2) { // Поиск кота по цвету.
                System.out.println("Укажите цвет кота");
                rdycolor = scanner.next();
                for (int i = 0; i < 3; i++) {
                    ;
                    if ( site[i].getColor().equalsIgnoreCase(rdycolor)) {
                        site[i].getAllInfo();
                    }
                }
            }
        } else if (num == 2) { // Добавление кота
            for (int i = 4; i < site.length; i++) {
                System.out.println("Укажите укажите имя кота");
                String newname = scanner.next();
                System.out.println("Укажите цвет кота");
                String newcolor = scanner.next();
                System.out.println("Укажите вес кота");
                int newwight = scanner.nextInt();
                System.out.println("Укажите возраст кота");
                int newage = scanner.nextInt();
                site[i] = new Cat(newname, newage, newwight, newcolor);
                System.out.println("Добавить еще одного?");
                System.out.println("1 ДА!");
                System.out.println("2 Нет");
                yn = scanner.nextInt();
                if (yn == 2) {
                    break;
                }


            }
        } else if (num == 3) { // Удаление кота

            for (int i = 0; i < 3; i++) {
                System.out.println("Удалить этого кота?");
                System.out.println("1 Да");
                System.out.println("2 Следующий");
                System.out.println("3 Я передумал");
                site[i].getAllInfo();
                yn = scanner.nextInt();
                if (yn == i) {
                    site[i] = null;
                } else if (yn == 2){
                } else if (yn == 3){
                    break;
                }
            }
        }

    }
}


