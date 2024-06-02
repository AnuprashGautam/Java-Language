### Method Hiding in Java: A Simple Explanation

**Method hiding** occurs when a subclass has a static method with the same signature as a static method in its superclass. In this case, the method in the subclass hides the method in the superclass.

### Key Points

1. **Static Methods**: Only static methods are involved in method hiding.
2. **Class References**: The method called depends on the reference type, not the object type.
3. **Not Polymorphic**: Unlike instance methods, static methods are resolved at compile time.

### Example

Here's a simple example to illustrate method hiding:

```java
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
```

### Output
```
Static method in Parent class.
Static method in Parent class.
Static method in Child class.
```

### Explanation

- `parent.display()` calls the `Parent` class's `display()` method.
- `childAsParent.display()` also calls the `Parent` class's `display()` method because the reference type is `Parent`, even though the object is of type `Child`.
- `child.display()` calls the `Child` class's `display()` method because the reference type is `Child`.

In summary, in method hiding, the version of the static method that gets called depends on the type of the reference, not the type of the object.