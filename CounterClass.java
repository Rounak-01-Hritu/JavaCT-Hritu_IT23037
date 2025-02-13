public class CounterClass {
    // Static variable to keep track of the number of instances created
    private static int instanceCount = 0;

    // Constructor to increment instance count every time an object is created
    public CounterClass() {
        instanceCount++;
        
        // If the count exceeds 50, reset the count to zero
        if (instanceCount > 50) {
            instanceCount = 0;
        }
    }

    // Static method to get the current instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        // Create 55 objects to demonstrate the functionality
        for (int i = 0; i < 55; i++) {
            new CounterClass();  // Create a new object
        }

        // Print the current instance count after creating 55 objects
        System.out.println("Total instances created: " + CounterClass.getInstanceCount());
    }
}