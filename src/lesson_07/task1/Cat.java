package lesson_07.task1;

public class Cat extends Animal {

    private boolean canMeow;

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public boolean isCanMeow() {
        return canMeow;
    }

    public void setCanMeow(boolean canMeow) {
        this.canMeow = canMeow;
    }
}
