package lesson_09;

import lesson_08.modeles.CardImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    /**
     * Блок теории 1
     * Коллекция - это массив с неограниченным размером и различными типами данных,
     * кроме ArrayList там один тип данных.
     *      Есть несколько враинатов коллекции:
     *      Интерфейсы коллекций: Collection u Map
     *      Рассмотрим ветку: Collection
     *
     *                   ________java.util,Collection_____________
     *      java.util.Set                               java.util.List
     *      - Все значения уникальны;                   -Могут хранится дубликаты значений;
     *      - Нет индексов;                             -Индексы есть;
     *      - Нет порядка вхождения;                    -Есть порядок вхождения;
     */


    public static void main(String[] args) {
        int [] array = new  int[5];
        int a = 0;
        Integer b = 10;


        //1. Создание коллекции и добавление в нее элементов.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        //2. метод add() - с указанием индекса

        list.add(2,15);

        //3. метод set() - затирает значение по определенному индексу

        list.set(3,333);

        //4. метод size() - возращает размер коллекции

        System.out.println(list.size());

        //5. get() - брать обьекты нашей коллекции

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " , ");
        }

        for (Integer c: list) {
            System.out.println(c + " , ");
        }

        // 6. toArray() - преобразование коллекции в массив

        Object [] objects = list.toArray();

        for (Object o: objects) {
            System.out.println(o + " , ");
        }

        // 7. метод contains() - содержит ли коллекция определенный элемент

        System.out.println("В коллекции содержится 101 - " + list.contains(101));
        System.out.println("В коллекции содержится 101 - " + list.contains(8));


        // 8. метод addAll() - добавить все элементы в новую коллекцию из старой

        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);

        //9. метод remove() - удаление элеметов коллекции по определенному индексу

        System.out.println("До вызова метода remove() по индексу 0" + list);
        list.remove(0);
        System.out.println("После вызова метода remove() по индексу 0" + list);


        //10. метод indexOf() - возвращать индекс определенного обьекта в коллекции
        System.out.println("Индекс элеметра 55 " + list.indexOf(55) );

        //11. sort() - сортировка

//        List<Integer> list1 ArrayList<>();
//        list1.add(11);
//        list1.add(1111);
//        list1.add(115);
//        list1.add(125);
//        list1.add(1);


        //12. isEmpty() - проверка пустой лист или нет

        System.out.println(list.isEmpty());

        //13. clear() - удаление всех элеметов коллекции

        copyList.clear();



        ArrayList<CardImpl> cards = new ArrayList<>();
        CardImpl card1 = new CardImpl("ands", 1);
        CardImpl card2 = new CardImpl("ands", 1);
        CardImpl card3 = new CardImpl("ands", 1);
        CardImpl card4 = new CardImpl("ands", 1);
        CardImpl card5 = new CardImpl("ands", 1);
        CardImpl card6 = new CardImpl("ands", 1);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
    }
}
