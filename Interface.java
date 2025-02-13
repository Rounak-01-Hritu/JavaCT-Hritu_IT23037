// Define the interface
interface Animal {
    void makeSound(); // Abstract method
}

// Implement the interface in the Dog class
class Dog implements Animal {
    
    public void makeSound() {
        System.out.println("Bark!");
    }
}

// Main class to run the program
public class Interface {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Creating an instance of Dog
        myDog.makeSound();      // Output: Bark!
    }
}
