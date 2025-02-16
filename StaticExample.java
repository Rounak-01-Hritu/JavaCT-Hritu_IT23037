class Example {
    static int staticVar = 100;  // Static member
    int nonStaticVar = 200;       // Non-static member

    static void staticMethod() {
        System.out.println("Static Method: " + staticVar);
    }

    void nonStaticMethod() {
        System.out.println("Non-Static Method: " + nonStaticVar);
        System.out.println("Can also access staticVar: " + staticVar);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Accessing static members
        System.out.println("Accessing staticVar: " + Example.staticVar);
        Example.staticMethod();

        // Accessing non-static members
        Example obj = new Example();
        System.out.println("Accessing nonStaticVar: " + obj.nonStaticVar);
        obj.nonStaticMethod();
    }
}
