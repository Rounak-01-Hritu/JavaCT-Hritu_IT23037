class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    //@Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    //@Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of type Animal

        myAnimal = new Dog(); // Dog object assigned to Animal reference
        myAnimal.makeSound(); // Calls Dog's overridden method

        myAnimal = new Cat(); // Cat object assigned to Animal reference
        myAnimal.makeSound(); // Calls Cat's overridden method
    }
}
