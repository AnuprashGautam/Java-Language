# Explain the use of `<default>` modifier in the Java with realtable example.

In Java, the **default** (or **package-private**) access modifier is applied to a class, method, or variable when no access modifier is specified. Classes, methods, or variables with default access are accessible only within the same package.

### Example

Let’s demonstrate this with multiple files in the same package to see how the default modifier works. In this example, we’ll use two classes: `Person` and `Employee`. Both classes will be in the same package, but we'll only allow certain access for methods with default access.

#### Project Structure

```
src/
├── mypackage/
│   ├── Person.java
│   ├── Employee.java
│   └── Main.java
```

### Step 1: Create `Person` Class with Default Access Members

**File**: `Person.java`

```java
package mypackage;

class Person {
    // Default access modifier
    String name;

    // Constructor with default access
    Person(String name) {
        this.name = name;
    }

    // Default access method
    void displayInfo() {
        System.out.println("Person's Name: " + name);
    }
}
```

In this file, we have:
- A class named `Person`, which has default access (no public keyword).
- A constructor and a method `displayInfo()` with default access.

Since they have default access, they are only accessible within the `mypackage` package.

### Step 2: Create `Employee` Class in the Same Package

**File**: `Employee.java`

```java
package mypackage;

public class Employee {
    private int id;
    Person person; // Reference to the Person class in the same package

    public Employee(int id, String name) {
        this.id = id;
        this.person = new Person(name); // Accessing default constructor of Person
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        person.displayInfo(); // Accessing default method of Person
    }
}
```

In the `Employee` class:
- We can access the `Person` class and its default constructor because `Employee` is in the same package as `Person`.
- The `displayInfo()` method of `Person` is also accessible in `Employee` due to its default access and because they are in the same package.

### Step 3: Create a `Main` Class to Test Accessibility

**File**: `Main.java`

```java
package mypackage;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice");
        emp.displayEmployeeDetails();
    }
}
```

In this `Main` class:
- We create an instance of `Employee`, which internally creates an instance of `Person`.
- The `Employee` class can access the default-access members of `Person` because they are in the same package.
  
### Output

When you run the `Main` class, the output will be:

```
Employee ID: 101
Person's Name: Alice
```

### Explanation of Default Access

1. **Access within the Package**: The `Employee` class can access the default `Person` class, its constructor, and `displayInfo()` method because they’re in the same package.
2. **Limited Scope**: If we try to access `Person` from a different package, or any of its members, we will get a compile-time error since default access restricts visibility to within the package.

### Summary

The default access modifier:
- Limits access to within the package.
- Is useful for organizing code that should only be accessible within a package, like helper or utility classes.
  
This example shows how the default access modifier restricts accessibility while allowing classes within the same package to interact freely.