import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        
        System.out.println(number + "! is");
        System.out.println(factorial(number));
    }
}
