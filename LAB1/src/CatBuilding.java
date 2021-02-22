import java.util.ArrayList;

public class CatBuilding extends Building {


    private ArrayList<Animal> cats = new ArrayList<>();
    public CatBuilding(String name) {
        super(name);
    }

    @Override
    public void addAnimal(Animal animal) {
        cats.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        cats.remove(animal);
    }
    @Override
    public   ArrayList<Animal> getAnimals()
    {
        return cats;
    }
}