package animals;

public class Parrot extends Animal {

    public Parrot(String name, int age) {
        super.setName(name);
        super.setAge(age);
        super.appetite = 10;
        super.maxAppetite = 20;
        super.voice = "good evening sir";
        super.maxDistanse = 100;
        super.foodChainLink = 2;
    }

    public void teachNewWord(String voice) {
        this.voice = voice;
    }
}



