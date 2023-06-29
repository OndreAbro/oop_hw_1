package animals;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super.setName(name);
        super.setAge(age);
        super.appetite = 50;
        super.maxAppetite = 100;
        super.voice = "meow-meow";
        super.maxDistanse = 500;
        super.foodChainLink = 1;
    }

    public void sleep() {
        this.appetite = this.appetite + (this.maxAppetite - this.appetite) / 2;
        System.out.println(this.name + " got some sleep.");
    }
}

