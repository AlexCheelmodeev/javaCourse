package lesson_16;

public class Sun {
    private static Sun instance;

    private String name;
    private String color;
    public static Sun getInstance(){
        if (instance == null){
            instance= new Sun();
        }
        return instance;
    }

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
}
