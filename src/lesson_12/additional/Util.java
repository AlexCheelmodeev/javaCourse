package lesson_12.additional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

    public static Specialist sortBySalary(List<Specialist> list){

          return list.stream()
                .max(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }

    public static Map<Speciality, List<Specialist>> groupingBySpecialty(List<Specialist> list){
        return list.stream().collect(Collectors.groupingBy(s -> s.getSpeciality()));
    }

    public static boolean matchAllSpecialistAreDevOps(List<Specialist> list){
        return list.stream().allMatch(s -> s.getSpeciality().equals(Speciality.DEVOPS));
    }

    public static boolean matchAllSpecialistSalaryMoreThen10000(List<Specialist> list){
        return list.stream().noneMatch(specialist -> specialist.getSalary().compareTo(10000) > 0);
    }
}
