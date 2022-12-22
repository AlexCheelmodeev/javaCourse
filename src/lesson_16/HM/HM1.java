package lesson_16.HM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HM1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

// Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

// Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = scanner.nextLine();
            list.add(line.toLowerCase());
        }
        // напишите тут ваш код

        int a = 0;
        for (char abs : alphabet) {
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if(abs == symbol)
                        a++;
                }
            }
            System.out.println(abs + " " + a);
            a = 0;
        }
    }
}

