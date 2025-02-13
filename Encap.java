class Person {
    private String name;  // Private variable

    public void setName(String name) {
        this.name = name;  // Setter method
    }

    public String getName() {
        return name;  // Getter method
    }
}

public class Encap {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");  
        System.out.println(p.getName());  // Output: John
    }
}

