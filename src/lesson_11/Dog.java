package lesson_11;

public class Dog {
    private String name;
    private boolean isCollarOn;
    private boolean isLeanOn;
    private boolean isMuzzleOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar(){
        System.out.println("Ошейник надет");
        this.isCollarOn = true;
    }

    public void putLean(){
        System.out.println("Ошейник надет");
        this.isLeanOn = true;
    }

    public void putMuzzle(){
        System.out.println("Ошейник надет");
        this.isMuzzleOn = true;
    }

    public void walk() throws DogIsNotRdyToWalkException{
        System.out.println("Пойдем гулять");
        if(isLeanOn && isMuzzleOn && isCollarOn){
            System.out.println("Ура " + name + " ! Идем гулять!");
        } else {
            throw new DogIsNotRdyToWalkException("Собака не готова гулять");
        }
    }
}
