public class Snippet{
public static void main(String[] args) {

    String s1 = "This is ICT 2107 Java";
    String s2 = new String("This is ICT 2107 Java");
    String s3 = "This is ICT 2107 Java";

    System.out.println(s1.equals(s2)); // Content comparison
    System.out.println(s1 == s2);      // Reference comparison
    System.out.println(s1 == s3);      // Reference comparison
}
}