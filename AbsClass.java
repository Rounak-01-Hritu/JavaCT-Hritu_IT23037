abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Bark!");
    }

}

public class AbsClass {
    public static void main(String [] args)
    {
        Dog myDog = new Dog();  // Creating an object of Dog
        myDog.makeSound();      // Output: Bark!
        myDog.sleep();          // Output: Sleeping...
    }
}
