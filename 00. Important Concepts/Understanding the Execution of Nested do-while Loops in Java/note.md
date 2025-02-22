# Understanding the Execution of Nested `do-while` Loops in Java

## Code Example:
```java
public class temp {
    public static void main(String[] args) {
        do  // Outer `do-while`
            do  // Inner `do-while`
                System.out.println("hello");  // Inside inner loop
            while (true);  // Inner loop runs indefinitely
        while (false);  // Outer loop condition (unreachable)
    }
}
```

## Why Does This Code Run Without Errors?
At first glance, it might seem that the inner `do-while` should be treated as two statements, requiring `{}`. However, Java allows a **single statement** inside loops and conditionals **without `{}`**, and here’s why this code is valid:

### 1. **A `do-while` Loop Is Considered a Single Statement**
In Java, a `do-while` loop, like `if`, `while`, or `for`, can act as a single statement when not enclosed in `{}`. The inner `do-while` loop:
```java
do  
    System.out.println("hello");
while (true);
```
counts as **one statement** in the outer `do-while` loop.

### 2. **Execution Flow**
1. The **outer `do-while`** begins execution.
2. It contains **one single statement**, which is the entire **inner `do-while` loop**.
3. The **inner `do-while`** executes:
   - It prints `"hello"` indefinitely due to `while (true);`.
   - Since it loops forever, control **never returns** to the outer loop.
4. The **outer loop's `while(false);` is never executed**, making it effectively useless.

### 3. **Would It Be Invalid If There Were Two Statements?**
Yes! If you had **two separate statements**, you **must** use `{}`:
```java
do
    System.out.println("hello");
    System.out.println("world");  // ERROR! More than one statement
while (true);
```
❌ This would cause a compilation error because there are two statements under `do` without `{}`.

✅ The correct way:
```java
do {
    System.out.println("hello");
    System.out.println("world");
} while (true);
```

## Conclusion
- **A `do-while` loop itself is a single statement**, so it can be used without `{}` in another loop.
- The **inner loop runs infinitely**, preventing the outer loop from ever executing its condition.
- If multiple statements were present, `{}` would be required.

Thus, the given code runs correctly and results in an **infinite loop printing `"hello"` indefinitely**.


