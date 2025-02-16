class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show(); // Calls the superclass method
        System.out.println("Child's show method");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
