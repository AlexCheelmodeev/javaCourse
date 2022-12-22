package lesson_16.HM;

import java.util.*;

public class HM5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNums = 0;
        int countWords = 0;

        ArrayList<String> list = new ArrayList<>();


        while (true) {
            String a = scanner.nextLine();
            if (a.equals("")) break;
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            if (isNumber(list.get(i))) {
                countNums++;
            } else if (!isNumber(list.get(i))) {
                countWords++;
            }
        }

        String[] nums = new String[countNums];
        String[] str = new String[countWords];
        String[] fin = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {

        }

        countNums = 0;
        countWords = 0;



        for (int i=0;i< list.size();i++) {
            if (isNumber(list.get(i))) {
                nums[countNums]=list.get(i); countNums++;
            }
            else {str[countWords]=list.get(i); countWords++;}
        }


        sortWords(str);
        sortNumbers(nums);



        countNums = 0;
        countWords = 0;
        for (int i=0;i<list.size();i++) {
            if (isNumber(list.get(i))) {
                fin[i] = nums [countNums]; countNums++;
            }
            else {fin[i] =str[countWords]; countWords++;}
        }

        for (int i = 0; i < fin.length; i++) {
            System.out.println(fin[i]);
        }
        }




        public static void sortNumbers(String [] array){
            String temp;
            for (int i=0;i<array.length;i++) {
                for (int j=1;j<array.length-i;j++) {
                    int a = Integer.parseInt(array[j-1]);
                    int b = Integer.parseInt(array[j]);
                    if(a<b) {
                        temp =array[j-1];
                        array[j-1]=array[j];
                        array[j]=temp;
                    }
                }
            }
        }
        public static void sortWords(String[] array){
        String temp;
            for (int i=0;i<array.length;i++) {
                for (int j=0;j<array.length-1;j++) {
                    if (isGreaterThen(array[j],array[j+1])){
                        temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }

    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
    public static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}