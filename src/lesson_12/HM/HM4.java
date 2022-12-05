package lesson_12.HM;

import java.util.HashMap;
import java.util.Map;

public class HM4 {
    public static void main(String[] args) {
        Map<String , String > map =new HashMap<>();
        map.put("арбуз" , "ягода");
        map.put("банан", "трава");
        map.put("вишня",  "ягода");
        map.put( "груша", "фрукт");
        map.put("дыня",  "овощ");
        map.put("ежевика",  "куст");
        map.put("жень-шень",  "корень");
        map.put("земляника", "ягода" );
        map.put("ирис", "цветок" );
        map.put("картофель", "клубень");

        for (String key:map.keySet()) {
            System.out.print(key);
            System.out.print(" - " + map.get(key));
            System.out.println("");
        }
    }
}
