package animals;

public class Hamster extends Animal {

    public Hamster(String name, int age) {
        super.setName(name);
        super.setAge(age);
        super.appetite = 10;
        super.maxAppetite = 20;
        super.voice = "squeak-squeak";
        super.maxDistanse = 100;
        super.foodChainLink = 2;
    }
}
