package HM08.DZ02;

public class Category extends Goods{
    private String name;

    public Category(String name, int price, double rating) {
        super(name, price, rating);
    }

    Goods[] cat = new Goods[9];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
