import java.util.ArrayList;

public abstract  class Building {


    protected  String name;

    public String getName() {
        return name;
    }
    public Building(String name) {
        this.name = name;
    }

    public   void addAnimal(Animal animal)    {

    }
    public abstract ArrayList<Animal> getAnimals();

    public   void removeAnimal(Animal animal){

    }
}