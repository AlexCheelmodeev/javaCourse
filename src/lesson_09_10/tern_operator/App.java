package lesson_09_10.tern_operator;

public class App {
    public static void main(String[] args) {
        People people = new People("Vasya", 17);

//        if (people.getAge()< 16){
//            System.out.println("Нет." + people.getName()+ " Ты не сможешь пройти") ;
//        } else {System.out.println("Да." + people.getName()+ " Проходи") ;}

        String answer = people.getAge() < 16 ?
                "Нет." + people.getName()+ " Ты не сможешь пройти"
                :
                "Да." + people.getName()+ " Проходи";

        System.out.println(answer);
    }
}
