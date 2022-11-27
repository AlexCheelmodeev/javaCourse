package lesson_09_10.HM10;

import java.util.ArrayList;
import java.util.Scanner;

public class HM03 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

      public static ArrayList<String> fix(ArrayList<String> strings) {

          for (int i = 0; i < strings.size(); i++) {
              if(strings.get(i).contains("р") && strings.get(i).contains("л") ){

              } else if (strings.get(i).contains("л")){
                  strings.add(i,strings.get(i));
                  i++;
              } else if ( strings.get(i).contains("р")){
                  strings.remove(i);
                  i--;
              }
          }return strings;

      }


}