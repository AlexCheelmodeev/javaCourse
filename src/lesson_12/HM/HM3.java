package lesson_12.HM;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        Map<String, String> map = new HashMap<String, String>();

        while (true)
        {
            String sity1 = reader.next();
            if (sity1.isEmpty())
                break;
            else {
                String lastName = reader.next();
                map.put(sity1, lastName);
            }
        }

        String cityKeyboard = reader.next();

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(cityKeyboard))
                System.out.println(pair.getValue());
        }
    }
}

