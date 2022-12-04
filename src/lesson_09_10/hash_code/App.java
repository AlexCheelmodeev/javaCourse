package lesson_09_10.hash_code;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        /**
         * Блок теории 3 HashCode
         * Ключевое слова Hash - означает каличие в коллекции механизма хэширования
         * Представьте что вы коллекционер монет и у Вас уже есть коллекция монет из 19 000 штук.
         * Вом предложили новую монету, кок быстро проверить есть ли ток я же у вос или нет, ведь
         в коллекции все монеты должны быть уникальный. Можно быстро проверить по страном, по номиналу, по диаметру, год выпуска.
         * То есть нужны характеристики которые есть у каждой монеты. * И характеристика должна быть
         объективно определяемой, например цвет не пойдет.
         * Совокупность хароктеристик может дать числовой код, который и покажет номер ячейки.
         * При этом у двух разных монеток могут быть разные хэшкоды, но у монет будут еще отличия,
         которые не вошли * в хэшкод, например цвет. Поэтому после отроботки методо .hashcode должен
         отроботать метод .equals u * окончательно сравнить монеты и вернуть boolean означающий есть
         такая монета в коллекции или нет.
         * */

        Coin coin1 = new Coin(10, 20.5, "Russia", 1995);
        Coin coin2 = new Coin(5, 15.5, "Russia", 2000);
        Coin coin3 = new Coin(2, 10, "Russia", 2008);
        Coin coin4 = new Coin(10, 20.5, "Russia", 1995);
        Coin coin5 = new Coin(10, 20.5, "USA", 2001);
        Coin coin6 = new Coin(20, 20.5, "UK", 2011);
        Coin coin7 = new Coin(15, 15.2, "Russia", 1992);


        TreeSet<Coin> coinsCollection = new TreeSet<>();
        coinsCollection.add(coin1);
        coinsCollection.add(coin2);
        coinsCollection.add(coin3);
        coinsCollection.add(coin4);
        coinsCollection.add(coin5);
        coinsCollection.add(coin6);
        coinsCollection.add(coin7);


        for (Coin c : coinsCollection) {
            System.out.println(c);
        }


    }
}

