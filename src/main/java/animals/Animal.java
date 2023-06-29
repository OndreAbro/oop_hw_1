package animals;

public class Animal {
    protected String name;
    protected int age;
    protected int appetite;
    protected int maxAppetite;
    protected String voice;
    protected int maxDistanse;
    protected int foodChainLink;

    protected void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must not be empty!");
        }
    }

    protected void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive!");
        }
    }

    public Animal() {}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move(int meters) {
        if (0 <= meters && meters <= this.maxDistanse) {
            if (this.appetite < this.maxAppetite) {
                System.out.println(this.name + " moved " + meters + " meters.");
                this.appetite = this.appetite + (meters / 10);
                if (this.appetite > this.maxAppetite) {
                    this.appetite = this.maxAppetite;
                }
            } else {
                System.out.println(this.name + " too hungry to move!");
            }
        } else {
            System.out.println(this.name + " cannot move this distance!");
        }
    }

    @Override
    public String toString() {
        try {
            return this.name + ", " + this.age + " [appetite: " + this.appetite + "]";
        } catch (NullPointerException e) {
        }
        return null;
    }
}
