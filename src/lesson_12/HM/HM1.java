package lesson_12.HM;

import java.util.HashMap;
import java.util.Map;

public class HM1 {
    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();
        map.put("Alex", "Che");
        map.put("Alexey", "Gribov");
        map.put("Alex", "303");
        map.put("Gorge", "Che");
        map.put("Andrey", "Popov");
        map.put("Petya", "Gribov");
        map.put("Petya", "Yur");
        map.put("Alex", "Uu");
        map.put("Yuriy", "Che");
        map.put("Vasya", "Yur");

        for (String key:map.keySet()) {
            System.out.print(key);
            System.out.print(" " + map.get(key));
            System.out.println("");
        }
    }
}
