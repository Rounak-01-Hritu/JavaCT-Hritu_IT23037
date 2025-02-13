import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int orig = n, rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return orig == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}