class Example {
    static int staticVar = 10;
    final int finalVar = 20;

    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    final void finalMethod() {
        System.out.println("Final Method Called");
    }
}

public class Test {
    public static void main(String[] args) {
        Example obj = new Example();
        
        obj.staticMethod();
        System.out.println(obj.staticVar);

        Example.staticMethod();
        System.out.println(Example.staticVar);
    }
}