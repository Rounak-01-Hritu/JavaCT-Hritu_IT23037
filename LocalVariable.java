class Car {
    static int count = 0; 
    
    Car() {
        count++;
    }
}

public class LocalVariable {
    public static void main(String[] args) {
        new Car();
        new Car();
        System.out.println("Total cars created: " + Car.count);
    }
}