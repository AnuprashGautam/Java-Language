# What is Nested Static Inner Class in Java?

A nested static inner class in Java is a static class defined within another class. It can be instantiated without an instance of the outer class. Here's a detailed example to explain it:

### Example: Nested Static Inner Class

```java
// Outer class
public class OuterClass {
    
    // Static nested class
    public static class StaticNestedClass {
        // Method in the static nested class
        public void display() {
            System.out.println("Inside static nested class");
        }
    }

    // Instance method in the outer class
    public void outerMethod() {
        System.out.println("Inside outer class method");
    }
}

// Main class to test the nested static inner class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        
        // Calling the method of the static nested class
        nestedObject.display();
        
        // Creating an instance of the outer class
        OuterClass outerObject = new OuterClass();
        
        // Calling the method of the outer class
        outerObject.outerMethod();
    }
}
```

### Explanation

1. **Defining the Outer Class**:
    - The outer class `OuterClass` contains a static nested class `StaticNestedClass` and an instance method `outerMethod`.

2. **Defining the Static Nested Class**:
    - The `StaticNestedClass` is defined within `OuterClass` using the `static` keyword. This means it can be accessed without needing an instance of `OuterClass`.
    - It has a method `display` that prints a message.

3. **Using the Static Nested Class**:
    - In the `Main` class, we create an instance of the static nested class using the syntax `OuterClass.StaticNestedClass`.
    - We then call the `display` method of the nested class instance.

4. **Using the Outer Class**:
    - We also create an instance of the outer class `OuterClass`.
    - We call the `outerMethod` of the outer class instance.

### Key Points

- **Access to Members**:
  - The static nested class can access the static members of the outer class but cannot directly access non-static members.
  - The outer class can access the members of the nested class if an instance of the nested class is created.

- **Encapsulation**:
  - The static nested class is used to logically group classes that are only used in one place, enhancing encapsulation and making the code more readable and maintainable.

- **Instantiation**:
  - The static nested class can be instantiated without needing an instance of the outer class, which is not possible with non-static nested classes.