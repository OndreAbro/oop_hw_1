package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalList {

    private List<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public boolean contains(Animal animal) {
        return animals.contains(animal);
    }

    public void play() {
        int animalIndex1 = new Random().nextInt(animals.size());
        int animalIndex2 = new Random().nextInt(animals.size());

        while (animalIndex1 == animalIndex2) {
            animalIndex1 = new Random().nextInt(animals.size());
            animalIndex2 = new Random().nextInt(animals.size());
        }

        Animal animal1 = animals.get(animalIndex1);
        Animal animal2 = animals.get(animalIndex2);

        if (animal1.foodChainLink == 1 && animal1.appetite > animal1.maxAppetite / 2 && animal2.foodChainLink == 2) {
            System.out.println("Oops. Looks like " + animal1.name + " ate " + animal2.name + "...");
            animals.remove(animal2);
        } else if (animal2.foodChainLink == 1 && animal2.appetite > (animal2.maxAppetite / 2) && animal1.foodChainLink == 2) {
            System.out.println("Oops. Looks like " + animal2.name + " ate " + animal1.name + "...");
            animals.remove(animal1);
        } else {
            System.out.println(animal1.name + " playing with " + animal2.name + ".");
        }
    }

    public void eat() {
        animals.forEach(animal -> {
            int food = new Random().nextInt(animal.maxAppetite);
            if (food >= animal.appetite) {
                animal.appetite = 0;
            } else {
                animal.appetite = animal.appetite - food;
            }
        });
    }

    public void giveTongue() {
        animals.forEach(animal -> System.out.println(animal.name + ": " + animal.voice));
    }
}


