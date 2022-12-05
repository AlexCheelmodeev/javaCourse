package lesson_12.additional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Specialist specialist = new Specialist("Vasiliy", 1000, Speciality.DEVELOPER);
        Specialist specialist1 = new Specialist("Alex", 4000, Speciality.DEVELOPER);
        Specialist specialist2 = new Specialist("Ivan", 1200, Speciality.PROJECT_MANAGER);
        Specialist specialist3 = new Specialist("Alexey", 1600, Speciality.DEVELOPER);
        Specialist specialist4 = new Specialist("Nadya", 1700, Speciality.PROJECT_MANAGER);
        Specialist specialist5 = new Specialist("Petya", 2000, Speciality.DEVOPS);

        List<Specialist> specialists = new ArrayList<>();
        specialists.add(specialist);
        specialists.add(specialist1);
        specialists.add(specialist2);
        specialists.add(specialist3);
        specialists.add(specialist4);
        specialists.add(specialist5);

        Util.oldFindByName(specialists, "Alex");
    }
}
