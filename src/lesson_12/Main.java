package lesson_12;

import lesson_12.additional.Day;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Создать коллеуцию HashMap турнирная таблица");
        HashMap<String , Integer> table = new HashMap<>();
        System.out.println("-----------------------------------------");
        table.put("Dinamo", 5);
        table.put("Shahter", 3);
        table.put("Spartak", 1);
        System.out.println("-----------------------------------------");
        System.out.println("2. При повторе ключа значение будет перезаписано");
        table.put("Spartak", 4);
        System.out.println("-----------------------------------------");
        System.out.println("3. containsKey() - Содержится ли такой ключ в мапе");
        System.out.println("-----------------------------------------");
        System.out.println(table.containsKey("Dinamo"));
        System.out.println(table.containsKey("Zenith"));
        System.out.println("4. проход по коллекции");
//        ArrayList<String > strings = new ArrayList<>();
//        strings.add("aaa");
//        strings.add("bbb");
//        strings.add("ccc");
        for (Map.Entry<String ,Integer> entry : table.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-----------------------------------------");
        System.out.println("5. Вернуть ключи нашей мапы");
        for (String key:table.keySet()) {
            System.out.println(key + ";");
        }
        System.out.println("-----------------------------------------");
        System.out.println("6. Вернуть значение нашей мапы");
        for (String key:table.keySet()) {
            System.out.println(table.get(key));
        }

        Day today = Day.FRIDAY;
        Day[] days = Day.values();
        for (Day d: days) {
            System.out.println(d);
        }
    }
}
