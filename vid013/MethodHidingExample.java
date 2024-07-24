import vid052.Child;
import vid052.Parent;

class Parent {
    public static void display() {
        System.out.println("Static method in Parent class.");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Static method in Child class.");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        // Static method calls
        parent.display();           // Calls Parent.display()
        childAsParent.display();    // Calls Parent.display()
        child.display();            // Calls Child.display()
    }
}

