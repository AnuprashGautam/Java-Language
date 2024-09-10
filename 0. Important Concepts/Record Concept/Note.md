# What is record class in JAVA?

In Java, a record is a special kind of class that is used to model immutable data. Introduced in Java 14 as a preview feature and became a standard feature in Java 16, records provide a compact syntax for declaring classes that are primarily used to store data. They automatically provide implementations of methods such as `equals()`, `hashCode()`, and `toString()`.

Here's an example of a record in Java:

```java
public record Person(String name, int age) {}
```

In this example, the `Person` record has two components: `name` and `age`. The compiler automatically generates the following for you:

1. A constructor that initializes the fields.
2. Getter methods for the fields.
3. `equals()`, `hashCode()`, and `toString()` methods.
4. Methods for component-wise access (`name()` and `age()` in this case).

Using the `Person` record is straightforward:

```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println(person.name()); // John Doe
        System.out.println(person.age()); // 30
        System.out.println(person); // Person[name=John Doe, age=30]
    }
}
```
**Note**: The `record` keyword is used to declare a record class in Java and to access the parameters we have to use the method format like `name()` and `age()`.

Records are useful for creating simple data carriers without the boilerplate code typically associated with creating such classes.