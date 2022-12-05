package lesson_12;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.putProducts("Яблоко", 1);
        fridge.putProducts("Яблоко", 1);
        fridge.putProducts("Груша", 10);
        fridge.putProducts("Банан", 4);
        fridge.putProducts("Киви", 2);
        fridge.putProducts("Груша", 5);
        fridge.putProducts("Апельсин", 6);
        fridge.putProducts("Яблоко", 12);

        fridge.getProducts("Яблоко", 5);
        fridge.getProducts("Груша", 10);
        fridge.getProducts("Молоко", 1);
        fridge.getProducts("Груша", 55);

    }
}
