class Car {
    String model; 
    
    Car(String model) {
        this.model = model;
    }
    
    void displayModel() {
        System.out.println("Model: " + model);
    }
}

public class Instance {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        car1.displayModel(); 
    }
}