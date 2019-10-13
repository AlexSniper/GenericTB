package alex.leaernprogramming;

public class Penguin extends Bird {

    public Penguin(String name,String food) {
        super(name, food);
    }
    @Override
    public void fly() {
        super.fly();
        System.out.println(" Penguin  doesn't know how to  fly ");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I like to eat "+getFood());



    }
}

