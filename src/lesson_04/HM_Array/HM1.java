package lesson_04.HM_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HM1 {
        public static void main(String[] args) throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String array[] = new String[10];
            for(int i = 0; i < 8; i++){
                array[i]= reader.readLine();
            }
            for(int j = 9; j >= 0; j--){
                System.out.println(array[j]);
            }
        }

}




