import animals.*;

public class Homework {

    /**
     * Нужно создать несколько классов животных:
     * 1. Пес (Собака)
     * 2. Кот (Кошка)
     * 3. ... придумать еще парочку
     * <p>
     * Каждое животное имеет: (поля)
     * 1. Имя (кличка)
     * 2. Возраст
     * 3. ... придумать еще какие-то параметры
     * <p>
     * Каждое животное может: (методы)
     * 1. Подавать голос
     * 2. Питаться (съедает какое-то количество еды, переданное в метод)
     * 3. Двигаться
     * 4. ... все, что сумеете придумать
     * <p>
     * Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
     * Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.
     * <p>
     * * Придумать свою структуру с наследованием по аналогии с животными и банковскими счетами.
     */
    public static void main(String[] args) {

        Dog barbos = new Dog("Barbos", 5);
        Cat murzik = new Cat("Murzik", 10);
        Hamster homa = new Hamster("Homa", 2);
        Parrot kesha = new Parrot("Kesha", 2);

        AnimalList flock = new AnimalList();
        flock.addAnimal(barbos);
        flock.addAnimal(murzik);
        flock.addAnimal(homa);
        flock.addAnimal(kesha);

        System.out.println(flock.getAnimals());

        flock.eat();

        System.out.println(flock.getAnimals());

        murzik.move(200);
        barbos.move(600);
        homa.move(10);
        kesha.move(20);
        murzik.sleep();

        System.out.println(flock.getAnimals());

        flock.eat();

        System.out.println(flock.getAnimals());

        murzik.move(100);
        barbos.move(1000);
        homa.move(40);
        kesha.move(60);

        System.out.println(flock.getAnimals());

        barbos.move(1000);
        barbos.move(1000);

        murzik.sleep();

        flock.giveTongue();
        kesha.teachNewWord("I thought a thought but the thought I thought wasn't the thought I thought I thought");
        flock.giveTongue();

        flock.play();
        flock.play();
        flock.play();

        System.out.println(flock.getAnimals());

    }
}
