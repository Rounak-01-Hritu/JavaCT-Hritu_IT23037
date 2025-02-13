class Example {
    void printMessage(String message) { 
        System.out.println(message);
    }
}

public class Parameter {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.printMessage("Hello, World!"); 
    }
}