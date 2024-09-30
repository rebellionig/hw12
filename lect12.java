package bana1.test_11_17.hw;


public class lect12 {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Fido");
        Horse horse = new Horse("Spirit");

        cat.run(50);
        cat.info();

        dog.run(30);
        dog.swim(10);
        dog.info();

        horse.run(20);
        horse.swim(5);
        horse.info();
    }
}
