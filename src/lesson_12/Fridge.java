package lesson_12;

import java.security.Key;
import java.util.HashMap;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();





    public void putProducts(String product,Integer value){
        if (products.containsKey(product)){
        products.put(product, products.get(product)+ value);
        } else {
            products.put(product,value);
        }
    }
    public  void getProducts(String product, Integer value){
        if (!products.containsKey(product)){
            System.out.println("Такого продукта нет " + product + " нету");
            return;
        }

        if (products.get(product) < value){
            System.out.println("Не хватает" +(value - products.get(product) +
                    ", вы взяли " + products.get(product) + " " + product));
            return;
        }

        if (products.get(product) > value){
            System.out.println("Осталось еще" + (products.get(product) - value) + " " + product);
            products.remove(product);
            return;
        }
        if (products.get(product) == value){
            System.out.println("Все продукты забрали");
            products.remove(product);
            return;
        }
    }
}
