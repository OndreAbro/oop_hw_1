package animals;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super.setName(name);
        super.setAge(age);
        super.appetite = 100;
        super.maxAppetite = 200;
        super.voice = "bark-bark";
        super.maxDistanse = 1000;
        super.foodChainLink = 1;
    }

    public void givePaw() {
        System.out.println(this.name + " giving a paw and breathing like a dog.");
    }
}

