package lesson_05.HMopt;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HM01 {
    public static void main(String[] args) throws IOException {
        {
            Scanner scanner = new Scanner(System.in);


            ArrayList<String> list = new ArrayList<String>();
            while (true) {
                String s = scanner.next();
                if (s.isEmpty()) break;
                list.add(s);
            }

            ArrayList<String> listUpperCase = new ArrayList<String>();
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                if (s.length() % 2 == 0) {
                    listUpperCase.add(s + " " + s);
                } else listUpperCase.add(s + " " + s + " " + s);
            }

            for (int i = 0; i < listUpperCase.size(); i++) {
                System.out.println(listUpperCase.get(i));
            }
        }
    }
}