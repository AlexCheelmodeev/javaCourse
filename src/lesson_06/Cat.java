package lesson_06;

public class Cat extends  Animal{

    //Поля
    private String name;
    private String color;
    private int age;
    private double weight;

    //Конструктор


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String name, int age, double weight , String color) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {

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

    public void getAllInfo(){
        System.out.println("Имя кота: " +getName());
        System.out.print(" Возраст кота: " + getAge());
        System.out.print(" Окрас кота: " +getColor());
        System.out.print(" Вес кота: " +getWeight());
    }

}
