package HM08.DZ03;

public class Person {
    private String fullname;
    private int age;

    private void move(){
        System.out.println(fullname +" is moving");
    }
    private void talk() {
        System.out.println("Prison is talking");
    }

    public Person(){}

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }


}
