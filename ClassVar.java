class Car {
    static int count = 0;  // Class variable
    
    Car() {
        count++;
    }
}

public class ClassVar {
    public static void main(String[] args) {
        new Car();
        new Car();
        System.out.println("Total cars: " + Car.count);  // Output: Total cars: 2
    }
}
