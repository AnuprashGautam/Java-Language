# What is sealed class in JAVA?

A sealed class in Java is a feature introduced in Java 15 as a preview feature and became a standard feature in Java 17. Sealed classes and interfaces restrict which other classes or interfaces may extend or implement them. This allows for more control over the class hierarchy and can help in modeling more precise and safer APIs.

### Key Points about Sealed Classes

1. **Restriction of Extending Classes**: Only a specific set of classes can extend a sealed class. This is declared using the `permits` keyword.

2. **Explicit Inheritance**: The classes that are allowed to extend a sealed class must be explicitly listed. If a class is not listed, it cannot extend the sealed class.

3. **Flexibility in Hierarchies**:
   - **Final classes**: These can extend the sealed class but cannot be extended further.
   - **Sealed classes**: These can extend the sealed class and further restrict their own subclasses.
   - **Non-sealed classes**: These can extend the sealed class and allow unrestricted inheritance from them.

### Syntax

Here's an example to illustrate sealed classes:

```java
public sealed class Shape permits Circle, Rectangle, Triangle {
    // common shape methods and fields
}

public final class Circle extends Shape {
    // specific implementation for Circle
}

public final class Rectangle extends Shape {
    // specific implementation for Rectangle
}

public non-sealed class Triangle extends Shape {
    // specific implementation for Triangle
    // other classes can extend Triangle
}
```

### Benefits of Sealed Classes

1. **Enhanced Modeling**: They allow you to model your domain more precisely by restricting the inheritance tree.
2. **Safety and Maintainability**: By limiting which classes can extend a sealed class, you can ensure that your code is more maintainable and safer from unintended modifications.
3. **Better Pattern Matching**: Sealed classes work well with pattern matching, which can lead to more concise and readable code.

### Example Use Case

Imagine you are designing a system for handling different types of payment methods. You might have a `Payment` class and specific subclasses like `CreditCardPayment`, `PaypalPayment`, and `BankTransferPayment`. By using sealed classes, you can ensure that only these specific payment methods are used and no other types can be inadvertently introduced.

```java
public sealed class Payment permits CreditCardPayment, PaypalPayment, BankTransferPayment {
    // common payment methods and fields
}

public final class CreditCardPayment extends Payment {
    // specific implementation for credit card payment
}

public final class PaypalPayment extends Payment {
    // specific implementation for PayPal payment
}

public final class BankTransferPayment extends Payment {
    // specific implementation for bank transfer payment
}
```

In summary, sealed classes in Java provide a powerful mechanism to restrict and control inheritance, making your class hierarchies more robust and easier to understand.