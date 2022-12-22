package lesson_16.HM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] result = word.toCharArray();
        List<Character> g = new ArrayList<>();
        List<Character> s = new ArrayList<>();

        for (char ch:result) {
            if (isVowel(ch)==true){
                g.add(ch);
            } else {
                s.add(ch);
            }
        }
        for (Character c : g){

            System.out.print(c + " ");
        }

        System.out.println();
        for (Character c : s){

            System.out.print(c + " ");
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) { // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

}

