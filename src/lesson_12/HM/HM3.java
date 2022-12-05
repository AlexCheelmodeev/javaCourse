package lesson_12.HM;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.next();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.next();

            map.put(city, family);
        }

        String city = reader.next();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }
}
