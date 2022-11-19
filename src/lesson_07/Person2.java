package lesson_07;

public class Person2 implements PeopleInterface{
    @Override
    public void run() {
        System.out.println("Running slow");
    }

    @Override
    public void eat() {
        System.out.println("Eating fast");
    }

    @Override
    public void talk() {
        System.out.println("Bad talking");
    }

    @Override
    public void jump() {
        System.out.println("Cool jumps");
    }

    @Override
    public void cry() {
        System.out.println("Never cry");

    }
}
