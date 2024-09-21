# What is yield keyword in Java and where to use it?

The `yield` keyword in Java is used in `switch` expressions to return a value from a particular case. This is part of the enhancements introduced in Java 12 and further refined in Java 13. It allows for more concise and readable code when dealing with `switch` expressions.

Here's a simple example to illustrate its usage:

```java
public class YieldExample {
    public static void main(String[] args) {
        String day = "MONDAY";
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println("Number of letters in " + day + " is " + numLetters);
    }
}
```

In this example, the `switch` expression evaluates the value of `day` and returns the number of letters in the corresponding string using the `yield` keyword. This is more readable and maintainable compared to the traditional `switch` statement.

### Where to Use `yield`
- **Switch Expressions**: When you need to return a value from a `switch` expression, making the code more concise and expressive.
- **Complex Case Logic**: When the logic inside a `case` block is complex and requires multiple steps to compute the result, `yield` can be used to clearly indicate the return value of the case.

Here's an example with more complex logic:

```java
public class ComplexYieldExample {
    public static void main(String[] args) {
        String day = "WEDNESDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> "Weekend";
            case "TUESDAY", "THURSDAY" -> "Weekday";
            case "WEDNESDAY" -> {
                String result = "Middle of the week";
                yield result;
            }
            case "SATURDAY" -> {
                String result = "Start of the weekend";
                yield result;
            }
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println(day + " is a " + typeOfDay);
    }
}
```

In this example, the `yield` keyword is used to return a value from the complex logic inside the `case` blocks for `WEDNESDAY` and `SATURDAY`. This allows the code to be more expressive and maintainable.