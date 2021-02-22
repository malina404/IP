public class Dog extends Animal{

    public Dog(String breed, String species) {
        super(breed,species);
    }

    @Override
    public void eat() {
        System.out.println("dog food");
    }

    @Override
    public void move() {
        System.out.println("dog walk");
    }

    @Override
    public void sound() {
        System.out.println("woof");
    }
}