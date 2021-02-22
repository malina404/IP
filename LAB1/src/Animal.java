
public abstract class Animal implements IAnimal {
    public String getBreed() {
        return breed;
    }

    private String breed;

    public String getSpecies() {
        return species;
    }

    private String species;

    public abstract void eat();
    public abstract void move();
    public abstract void sound();
    public Animal(String breed, String species) {
        this.breed = breed;
        this.species=species;
    }
}