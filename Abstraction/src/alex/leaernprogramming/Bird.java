package alex.leaernprogramming;

public abstract class Bird extends Animal implements  ICanFly{
    @Override
    public void eat() {
        System.out.println(getName()+ " is pecking "+getFood());
    }

    @Override
    public void breath() {
        System.out.println(" Breath in, breath out repeat");

    }

    public Bird(String name, String food) {

        super(name, food);

    }

    @Override
    public void fly() {

        System.out.println(getName()+" is flapping its wings");

    }
}
