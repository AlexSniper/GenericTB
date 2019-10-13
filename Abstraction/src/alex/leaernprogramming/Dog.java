package alex.leaernprogramming;

public class Dog extends Animal {


    public Dog(String name,String food) {
        super(name,food);
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+getFood());
    }

    @Override
    public void breath() {
        System.out.println(getName()+" is breathing in , breathing out, repeat");

    }



    }

