package alex.leaernprogramming;

public abstract class Animal {


    private String name;
    private String food;


    public String getFood() {
        return food;
    }

    public Animal(String name, String food) {
        this.name = name;
        this.food =food;

    }
    public  abstract  void eat();
    public abstract void breath();

    public String getName() {
        return name;

    }

}
