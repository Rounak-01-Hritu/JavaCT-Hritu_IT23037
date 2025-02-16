import java.util.Random;

public class CustomRandomGenerator {
    // Predefined array with some random values
    private static final int[] predefinedArray = {3, 7, 11, 19, 23, 29, 37, 41};

    // Maximum value for modulo operation
    private static final int maxValue = 100; 


    public static void myRand(int n) {
        long currentTime = System.currentTimeMillis(); // Get current timestamp
        Random rand = new Random();

        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < n; i++) {
            int index = rand.nextInt(predefinedArray.length); // Pick a random index
            int randNum = (int) ((currentTime * predefinedArray[index]) % maxValue);
            System.out.println(randNum);
        }
    }

    /**
     * Overloaded method: Generates a single random number
     */
    public static int myRand() {
        long currentTime = System.currentTimeMillis();
        int index = new Random().nextInt(predefinedArray.length);
        return (int) ((currentTime * predefinedArray[index]) % maxValue);
    }

    /**
     * Main method to demonstrate the usage of myRand(n)
     */
    public static void main(String[] args) {
        // Generate 5 random numbers
        myRand(5);

        // Generate a single random number
        System.out.println("\nSingle Random Number: " + myRand());
    }
}
