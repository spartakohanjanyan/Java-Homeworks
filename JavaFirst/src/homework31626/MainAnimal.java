package homework31626;

public class MainAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Chalo");
        Cat cat = new Cat("Piso");

        dog.makeSound();
        cat.makeSound();
        animal.makeSound();
    }
}
