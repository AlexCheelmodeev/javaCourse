package lesson_11;

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        dog.putCollar();
        dog.putLean();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotRdyToWalkException e) {
            e.printStackTrace();
        }
    }
}
