package lesson_07.task1;



public class App {
    public static void main(String[] args) {
        Animal [] zoo = new Animal[10];

        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();

        cat.setFood("Fish");
        cat.setLocation("Yard");

        dog.setFood("Bones");
        dog.setLocation("Home");

        horse.setFood("Weed");
        horse.setLocation("Barn");


        zoo [0] = dog;
        zoo [1] = horse;
        zoo [2]= cat;

        Vet vet = new Vet();
        for (int i = 0; i < zoo.length; i++) {
            if (zoo != null){
                vet.treatAnimal(zoo[i]);
            }
        }
    }
}
