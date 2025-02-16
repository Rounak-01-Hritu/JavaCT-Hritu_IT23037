class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parent obj = new Child(); // Polymorphism in action
        obj.show(); // Calls the overridden method in Child class
    }
}
