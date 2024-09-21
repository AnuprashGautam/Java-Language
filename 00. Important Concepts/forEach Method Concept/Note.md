# What is forEach() method in Java?

The `forEach` statement in Java is a method provided by the `Iterable` interface, which is used to iterate over elements in a collection. It allows you to perform an action for each element of the collection. The `forEach` method takes a `Consumer` functional interface as an argument, which defines the action to be performed on each element.

Here's a basic example of using the `forEach` method:

```java
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using forEach with a lambda expression
        names.forEach(name -> System.out.println(name));

        // Using forEach with a method reference
        names.forEach(System.out::println);
    }
}
```

### Key Points

1. **Lambda Expression**: The `forEach` method is often used with a lambda expression to define the action to be performed on each element. In the example above, `name -> System.out.println(name)` is a lambda expression that prints each name.

2. **Method Reference**: You can also use a method reference as shown in the second `forEach` example, where `System.out::println` is a method reference that points to the `println` method of `System.out`.

3. **Functional Interface**: The `Consumer` interface is a functional interface that represents an operation that accepts a single input argument and returns no result. It has a single abstract method `accept(T t)`.

### Advantages

- **Simplified Syntax**: `forEach` provides a more concise and readable way to iterate over elements compared to traditional `for` or `while` loops.
- **Functional Style**: It allows for a functional programming style, which can make code easier to understand and maintain.

### Example with Custom Action

You can define any action within the lambda expression. For instance, if you want to print each name in uppercase, you can do:

```java
names.forEach(name -> System.out.println(name.toUpperCase()));
```

### Using `forEach` with Streams

The `forEach` method is also available in the `Stream` interface, allowing you to perform operations on elements of a stream:

```java
import java.util.stream.Stream;

public class StreamForEachExample {
    public static void main(String[] args) {
        Stream.of("Alice", "Bob", "Charlie")
              .forEach(name -> System.out.println(name));
    }
}
```

Using `forEach` in streams is particularly useful when combined with other stream operations like `filter`, `map`, etc.

In summary, the `forEach` statement is a powerful and flexible way to iterate over collections in Java, allowing you to easily apply a specified action to each element.