# What is Inner class in JAVA?

In Java, an inner class is a class defined within another class. Inner classes are used to logically group classes that are only used in one place, increasing encapsulation and readability. They also have access to the members, including private members, of the outer class.

There are four types of inner classes in Java:

1. **Nested Static Class**:
    - A static inner class that does not require an instance of the outer class.
    - Can access static members of the outer class.
    - Cannot access non-static members directly.

    ```java
    class OuterClass {
        static class StaticNestedClass {
            void display() {
                System.out.println("Inside static nested class");
            }
        }
    }
    ```

2. **Non-static Nested Class (Inner Class)**:
    - Requires an instance of the outer class to be instantiated.
    - Can access both static and non-static members of the outer class.

    ```java
    class OuterClass {
        class InnerClass {
            void display() {
                System.out.println("Inside non-static nested class");
            }
        }
    }
    ```

3. **Local Inner Class**:
    - Defined within a block, typically a method.
    - Only accessible within the block where it is defined.
    - Can access final or effectively final local variables and members of the enclosing class.

    ```java
    class OuterClass {
        void someMethod() {
            class LocalInnerClass {
                void display() {
                    System.out.println("Inside local inner class");
                }
            }
            LocalInnerClass local = new LocalInnerClass();
            local.display();
        }
    }
    ```

4. **Anonymous Inner Class**:
    - Defined and instantiated in a single expression.
    - Used to override methods or implement interfaces with only one instance.

    ```java
    class OuterClass {
        void someMethod() {
            Runnable r = new Runnable() {
                public void run() {
                    System.out.println("Inside anonymous inner class");
                }
            };
            new Thread(r).start();
        }
    }
    ```

Inner classes are useful for logically grouping classes, enhancing encapsulation, and creating more readable and maintainable code.