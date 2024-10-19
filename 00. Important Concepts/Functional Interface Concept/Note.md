# What is a Functional Interface in Java?

A functional interface in Java is an interface that contains exactly one abstract method. It serves as a contract for lambda expressions and method references, enabling functional programming concepts to be applied in Java. Functional interfaces are a key feature introduced in Java 8 as part of the lambda expressions and the Streams API to support functional-style programming.

### Why Functional Interfaces were Introduced

Functional interfaces were introduced primarily to facilitate the use of lambda expressions, which are concise representations of anonymous functions. They promote writing cleaner, more readable code by reducing the need for verbose anonymous inner classes. This feature aligns Java more closely with modern programming paradigms seen in languages like Scala, Haskell, and JavaScript.

### Syntax of Functional Interface

A functional interface has the following characteristics:

1. It contains exactly one abstract method (SAM - Single Abstract Method).
2. It may contain any number of default methods or static methods.
3. It can be annotated with `@FunctionalInterface` annotation (optional, but recommended for clarity).

### Example of a Functional Interface

Here's an example of a functional interface:

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Abstract method

    // Default method
    default void displayResult(int result) {
        System.out.println("Result: " + result);
    }

    // Static method
    static void printInfo() {
        System.out.println("Calculator interface");
    }
}
```

In this example:

- `Calculator` is a functional interface because it declares exactly one abstract method (`calculate`).
- It also includes a default method (`displayResult`) and a static method (`printInfo`).

### Using Functional Interfaces

You can use functional interfaces to create lambda expressions or method references. Here's how you can use the `Calculator` interface:

```java
public class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement calculate method of Calculator interface
        Calculator addition = (a, b) -> a + b;
        int result = addition.calculate(10, 5); // result = 15
        addition.displayResult(result); // Output: Result: 15

        // Using method reference
        Calculator subtraction = Main::subtract;
        result = subtraction.calculate(10, 5); // result = 5
        subtraction.displayResult(result); // Output: Result: 5

        // Calling static method of functional interface
        Calculator.printInfo(); // Output: Calculator interface
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
```

In this example:

- We define lambda expressions to implement the `calculate` method for addition and subtraction.
- `Main::subtract` demonstrates the use of a method reference for subtraction.
- The `displayResult` and `printInfo` methods are called using default and static methods respectively defined in the `Calculator` interface.

### Benefits of Functional Interfaces

1. **Concise Code**: Lambda expressions reduce boilerplate code when passing behaviors to methods or defining callbacks.
2. **Readability**: Functional interfaces enhance code readability by focusing on the behavior rather than the mechanics of object-oriented interfaces.
3. **Support for Streams and APIs**: Functional interfaces are integral to Java's Streams API, enabling functional-style operations on collections.

In essence, functional interfaces enable Java to support functional programming paradigms more effectively, enhancing flexibility and readability in code.