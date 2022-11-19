package lesson_07;

public class Person1 implements PeopleInterface{

    @Override
    public void run() {
        System.out.println("Running fast");
    }

    @Override
    public void eat() {
        System.out.println("Eating slow");
    }

    @Override
    public void talk() {
        System.out.println("Funny talking");
    }

    @Override
    public void jump() {
        System.out.println("bad jumps");
    }

    @Override
    public void cry() {
        System.out.println("Crying hard");
    }
}
