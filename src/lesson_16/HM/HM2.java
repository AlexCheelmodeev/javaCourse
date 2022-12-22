package lesson_16.HM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap();
        while (true) {
            String num = scanner.nextLine();
            if (num.equals("")) break;
            int f = Integer.parseInt(num);
            String name = scanner.nextLine();
            map.put(name, f);
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
