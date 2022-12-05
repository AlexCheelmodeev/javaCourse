package lesson_12.additional;

import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public static Specialist oldFindByName(List<Specialist> list,String name){
        for (Specialist s: list) {
            if (s.getName().startsWith(name)){
                System.out.println(s);
            }
            return s;
        }
        return null;
    }

//    public static List<Specialist> Specialist newFindByName(List<Specialist> list,String name){
//        list.stream().filter(x -> x.getName().startsWith("Al")).collect(Collectors.toList());
//
//    }


}
