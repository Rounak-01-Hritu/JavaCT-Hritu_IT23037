import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            if (root1 > 0 && root2 > 0) {
                System.out.println("The smallest positive root is: " + Math.min(root1, root2));
            } else if (root1 > 0) {
                System.out.println("The smallest positive root is: " + root1);
            } else if (root2 > 0) {
                System.out.println("The smallest positive root is: " + root2);
            } else {
                System.out.println("No real positive roots.");
            }
        } else {
            System.out.println("No real roots.");
        }
        scanner.close();
    }
}
