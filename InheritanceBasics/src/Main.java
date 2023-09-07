public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", "big", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog labrador = new Dog("Labrador", 65, "Floppy", "Swimmer");
        doAnimalStuff(labrador, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}
