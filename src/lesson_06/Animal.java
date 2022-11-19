package lesson_06;

public class Animal {
    //Поля
    private String name;
    private String color;
    private int age;
    private double weight;
    //Конструторы

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    //Методы

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
