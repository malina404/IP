
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        Animal cat1 = new Cat("British", "cat");
        Animal cat2 = new Cat("Russian", "cat");
        Animal cat3 = new Cat("Persian", "cat");
        Animal dog1 = new Dog("York", "dog");
        Animal dog2 = new Dog("Amstaff", "dog");
        zoo.add(cat1);
        zoo.add(cat2);
        zoo.add(cat3);
        zoo.add(dog1);
        zoo.add(dog2);
        cat1.eat();

        ArrayList<Building> buildings = new ArrayList<>();
        Building  catBuilding1 = new CatBuilding("cat Building 1");
        Building dogBuilding1 = new DogBuilding("dog Building 1");
        Building catBuilding2 = new CatBuilding("cat Building 2");
        buildings.add(catBuilding1);
        buildings.add(catBuilding2);
        buildings.add(dogBuilding1);

        catBuilding1.addAnimal(cat1);
        catBuilding1.addAnimal(cat2);
        catBuilding2.addAnimal(cat3);
        dogBuilding1.addAnimal(dog1);

        for( Building building: buildings)        {
            System.out.println(building.getName());
            for (Animal animal : building.getAnimals())
            {
                System.out.print (animal.getSpecies()+ " ");
                System.out.println(animal.getBreed());

            }
        }


    }
}