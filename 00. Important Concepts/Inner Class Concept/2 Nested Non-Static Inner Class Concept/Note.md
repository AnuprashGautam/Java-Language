# What is Nested Non-Static Inner Class in Java?

A non-static nested class, also known as an inner class, is a class defined within another class without the `static` keyword. It has access to the instance members of its enclosing class and requires an instance of the outer class to be instantiated. Here's a detailed example to explain it:

### Example: Non-static Nested Class (Inner Class)

```java
// Outer class
public class OuterClass {
    
    // Non-static nested class (Inner class)
    public class InnerClass {
        // Method in the inner class
        public void display() {
            System.out.println("Inside non-static nested class");
            System.out.println("Outer class member variable value: " + outerMember);
        }
    }

    // Instance member of the outer class
    private int outerMember = 10;

    // Instance method in the outer class
    public void outerMethod() {
        System.out.println("Inside outer class method");

        // Creating an instance of the inner class
        InnerClass innerObject = new InnerClass();
        innerObject.display();
    }
}

// Main class to test the non-static nested class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObject = new OuterClass();
        
        // Creating an instance of the inner class using the outer class instance
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        
        // Calling the method of the inner class
        innerObject.display();
        
        // Calling the method of the outer class
        outerObject.outerMethod();
    }
}
```

### Explanation

1. **Defining the Outer Class**:
    - The outer class `OuterClass` contains a non-static nested class `InnerClass` and an instance member `outerMember` with a value of `10`.
    - It also has an instance method `outerMethod`.

2. **Defining the Non-static Nested Class (Inner Class)**:
    - The `InnerClass` is defined within `OuterClass` without the `static` keyword.
    - It has a method `display` that prints a message and the value of the `outerMember` of the outer class.

3. **Using the Non-static Nested Class**:
    - In the `Main` class, we first create an instance of the outer class `OuterClass`.
    - We then create an instance of the inner class using the syntax `outerObject.new InnerClass()`.
    - We call the `display` method of the inner class instance.

4. **Using the Outer Class**:
    - We also call the `outerMethod` of the outer class instance, which in turn creates an instance of the inner class and calls its `display` method.

### Key Points

- **Access to Members**:
  - The inner class has access to the instance members of the outer class, including private members.
  - This allows the inner class to directly interact with the members of the outer class.

- **Instantiation**:
  - The inner class requires an instance of the outer class to be instantiated.
  - This is done using the syntax `outerObject.new InnerClass()`, where `outerObject` is an instance of the outer class.

- **Encapsulation**:
  - Inner classes are used to logically group classes that are only used in one place, enhancing encapsulation and making the code more readable and maintainable.
