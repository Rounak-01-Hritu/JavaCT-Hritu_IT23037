import java.util.Scanner;

public class FactorionFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = scanner.nextInt();
        scanner.close();
        
        for (int i = lower; i <= upper; i++) {
            if (isFactorion(i)) System.out.print(i + " ");
        }
    }
    
    private static boolean isFactorion(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }
    
    private static int factorial(int n) {
        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        return fact[n];
    }
}