package lesson_07.task1;

public class Vet {

    private Animal animal;
    public void treatAnimal(Animal animal){
        System.out.println(animal.getFood() + " " +animal.getLocation());
    }


}
