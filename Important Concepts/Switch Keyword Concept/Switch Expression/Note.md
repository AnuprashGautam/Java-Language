# What is a Switch Expression in Java?

In Java, a switch expression is an enhancement to the traditional switch statement, introduced in Java 12 as a preview feature and made a standard feature in Java 14. It provides a more concise and expressive way to handle multiple possible values for a variable, often making the code more readable and less error-prone. Here are some key aspects of switch expressions:

1. **Syntax**:
   - Traditional switch statements have a series of `case` labels followed by a colon (`:`) and a block of code, often requiring a `break` statement to exit each case.
   - Switch expressions use `->` to separate the case label from the expression to be executed, and do not require explicit `break` statements.

2. **Returning a Value**:
   - Switch expressions can return a value directly, making them more suitable for assignments and functional programming styles.
   - The `yield` keyword is used to return a value from a block of code within a switch expression.

3. **Exhaustiveness**:
   - A switch expression must cover all possible cases, either directly or through a `default` case. This ensures that the switch expression always produces a value.

### Example of Switch Expression

Here’s a simple example to illustrate the syntax and usage of switch expressions:

```java
int dayOfWeek = 3;
String dayName = switch (dayOfWeek) {
    case 1 -> "Sunday";
    case 2 -> "Monday";
    case 3 -> "Tuesday";
    case 4 -> "Wednesday";
    case 5 -> "Thursday";
    case 6 -> "Friday";
    case 7 -> "Saturday";
    default -> throw new IllegalArgumentException("Invalid day: " + dayOfWeek);
};

System.out.println(dayName); // Output: Tuesday
```

### Example with a Block and Yield

In cases where the logic for a case is more complex, you can use a block with the `yield` keyword:

```java
int score = 85;
String grade = switch (score / 10) {
    case 10, 9 -> "A";
    case 8 -> "B";
    case 7 -> "C";
    case 6 -> "D";
    default -> {
        if (score < 60) yield "F";
        else throw new IllegalArgumentException("Invalid score: " + score);
    }
};

System.out.println(grade); // Output: B
```

### Advantages of Switch Expressions

1. **Conciseness**: The syntax is more concise, reducing boilerplate code such as repetitive `break` statements.
2. **Readability**: The structure is more straightforward, improving code readability.
3. **Functional Style**: They can be used in assignments and return statements, aligning with functional programming practices.

Switch expressions provide a modern alternative to switch statements, making your code more expressive and maintainable.