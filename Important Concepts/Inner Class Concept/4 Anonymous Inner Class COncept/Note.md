# What is Anonymous Inner Class in Java?

An anonymous inner class in Java is a class that does not have a name and is used to instantiate objects with certain "on-the-fly" modifications, typically for implementing interfaces or extending classes in a concise way. It is often used for creating instances of listener interfaces in GUI applications or for quickly overriding methods.

### Example: Anonymous Inner Class

Here's a detailed example to explain anonymous inner classes:

```java
// Outer class
public class OuterClass {

    // Instance method in the outer class
    public void outerMethod() {
        System.out.println("Inside outer class method");

        // Creating an instance of an anonymous inner class that implements Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside anonymous inner class");
                System.out.println("Outer class member variable value: " + outerMember);
            }
        };

        // Running the runnable
        new Thread(runnable).start();
    }

    // Instance member of the outer class
    private int outerMember = 100;

    // Another instance method in the outer class
    public void anotherOuterMethod() {
        System.out.println("Inside another outer method");
    }
}

// Main class to test the anonymous inner class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObject = new OuterClass();
        
        // Calling the method of the outer class that uses the anonymous inner class
        outerObject.outerMethod();
    }
}
```

### Explanation

1. **Defining the Outer Class**:
    - The outer class `OuterClass` contains an instance member `outerMember` and two instance methods: `outerMethod` and `anotherOuterMethod`.

2. **Creating an Anonymous Inner Class**:
    - Inside the `outerMethod`, an instance of `Runnable` is created using an anonymous inner class.
    - The `Runnable` interface's `run` method is overridden within the anonymous inner class.
    - The anonymous inner class has access to the `outerMember` of the outer class.

3. **Using the Anonymous Inner Class**:
    - The anonymous inner class instance is passed to a `Thread` object, and its `run` method is called when the thread is started.

4. **Using the Outer Class**:
    - In the `Main` class, an instance of the outer class `OuterClass` is created.
    - The `outerMethod` of the outer class instance is called, which in turn creates and uses the anonymous inner class.

### Key Points

- **No Name**:
  - Anonymous inner classes do not have a name and are defined and instantiated in a single expression.
  - They are typically used for quick and one-time use cases.

- **Access to Variables**:
  - Anonymous inner classes can access final or effectively final local variables from the enclosing block.
  - They can also access all members of the outer class, including private members.

- **Instantiation**:
  - Anonymous inner classes are instantiated at the point of use, and their definition and instantiation happen simultaneously.

### Use Cases

- **Event Handling in GUI Applications**:
  - Commonly used for implementing event listeners and handlers in GUI applications, such as those created using Java Swing or JavaFX.

- **Quick Overriding**:
  - Useful for quickly creating instances of classes or interfaces with minor modifications, especially for single-use scenarios.

### Example: Event Handling with Anonymous Inner Class

```java
import javax.swing.*;
import java.awt.event.*;

public class EventHandlingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Inner Class Example");
        JButton button = new JButton("Click Me");

        // Adding an ActionListener using an anonymous inner class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

In this example, an anonymous inner class is used to implement the `ActionListener` interface for handling button click events. This is a typical use case for anonymous inner classes in Java GUI applications.

