package lesson_12.HM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        HashMap<String,Integer  > monthOrder = new HashMap<>();
        monthOrder.put("Январь", 1);
        monthOrder.put("Февраль", 2) ;
        monthOrder.put("Март", 3);
        monthOrder.put("Апрель", 4);
        monthOrder.put("Май", 5);
        monthOrder.put("Июнь", 6);
        monthOrder.put("Июль", 7);
        monthOrder.put("Август", 8);
        monthOrder.put("Сентябрь", 9);
        monthOrder.put("Октябрь", 10);
        monthOrder.put("Ноябрь", 11);
        monthOrder.put("Декабрь", 12);

        for (Map.Entry<String, Integer> p : monthOrder.entrySet()) {
            if(month.equals(p.getKey())){
                System.out.println(month + " is the " + p.getValue() + " month");
            }
        }


    }
}
