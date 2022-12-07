package lesson_12.additional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public static Specialist oldFindBySpecialty(List<Specialist> list, String name){
        for (Specialist s: list) {
            if (s.getName().startsWith(name)){
                System.out.println(s);
            }
            return s;
        }
        return null;
    }

    public static List<Specialist>  newFindByName(List<Specialist> list,String name){
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

    public static List<Specialist> newSortByName(List<Specialist> list){
        return list.stream().sorted(Comparator.comparing(specialist -> specialist.getName())).collect(Collectors.toList());
    }


}
