# What is a Switch Statement in Java?

A switch statement in Java is a control flow statement that allows you to execute one block of code from multiple options based on the value of a variable or expression. It is an alternative to using a series of `if-else` statements when you need to compare a single variable against a series of constant values.

### Syntax
```java
switch (expression) {
    case value1:
        // code to be executed if expression equals value1
        break;
    case value2:
        // code to be executed if expression equals value2
        break;
    // you can have any number of case statements
    default:
        // code to be executed if none of the cases match
}
```

### Key Points
1. **Expression**: The expression must evaluate to a byte, short, int, char, or their corresponding wrapper classes (Byte, Short, Integer, Character), an `enum`, or a `String`.
2. **Case Labels**: Each case label must be a unique constant expression. Once a match is found, the corresponding block of code is executed.
3. **Break Statement**: The `break` statement is used to terminate the switch statement. Without it, the program continues to execute the next case statements (known as "fall-through").
4. **Default Case**: The `default` case is optional and can be used to execute code if none of the cases match.

### Example
```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);
    }
}
```
In this example, the value of `day` is 3, so the output will be "The day is: Tuesday". The `break` statement ensures that once the matching case is executed, the switch statement terminates, preventing the execution of subsequent cases.