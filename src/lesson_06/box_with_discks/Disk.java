package lesson_06.box_with_discks;

public abstract class Disk {

    //Поля
    private String name;
    private int year;

    //Конструктор

    public Disk(String name, int year) {
        this.name = name;
        this.year = year;
    }
    // Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void printAllInfo();

    }



