

public class Cat extends Animal{

    public Cat(String breed, String species) {
        super(breed,species);
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }

    public void eat(String  food) {
        System.out.println(food);
    }

    @Override
    public void move() {
        System.out.println("run");
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }
}