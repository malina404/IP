import java.util.ArrayList;

public class DogBuilding extends Building {

    private ArrayList<Animal> dogs = new ArrayList<>();

    public DogBuilding(String name) {
        super(name);
    }

    @Override
    public void addAnimal(Animal animal) {
        dogs.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        dogs.remove(animal);
    }

    @Override
    public   ArrayList<Animal> getAnimals()
    {
        return dogs;
    }
}