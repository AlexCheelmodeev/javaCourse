package lesson_12.HM;

import java.util.HashMap;
import java.util.Map;

public class HM5 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for (String key:map.keySet()) {
            System.out.print(key);
            System.out.print(" - " + map.get(key));
            System.out.println("");
        }
    }


}
