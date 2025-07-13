### 🧠 Java: `is-a` vs `has-a` Relationship + Static Members in Inner Classes

---

### 🔹 `is-a` Relationship (Inheritance / Interface Implementation)

* **Represents**: Inheritance or Interface Implementation
* **Implies**: One class **is a subtype** of another.
* **Used for**: Code reusability, polymorphism, method overriding.

#### ✅ Example:

```java
class Animal {
    void eat() { System.out.println("This animal eats"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}
```

Now:

* `Dog` **is-a** `Animal`
* `Dog` inherits `eat()` from `Animal`

---

### 🔹 `has-a` Relationship (Composition / Aggregation)

* **Represents**: One class contains a reference to another.
* **Implies**: One class **owns or uses** another.
* **Used for**: Composition and code modularity.

#### ✅ Example:

```java
class Engine {
    void start() { System.out.println("Engine starts"); }
}

class Car {
    Engine engine = new Engine();  // Car has-a Engine
}
```

Here:

* `Car` **has-a** `Engine`

---

### 🔁 Comparison Table

| Feature           | `is-a`                  | `has-a`                        |
| ----------------- | ----------------------- | ------------------------------ |
| Relationship Type | Inheritance / Interface | Composition / Aggregation      |
| Java Keywords     | `extends`, `implements` | Class reference inside another |
| Code Reuse Style  | Inheritance-based       | Delegation-based               |
| Example           | `Dog is-a Animal`       | `Car has-a Engine`             |

---

## ⚠️ Static Members in Inner Classes

### 🧷 Rule (Simplified)

| Inner Class Type       | Static Members Allowed?                                     | Why?                         |
| ---------------------- | ----------------------------------------------------------- | ---------------------------- |
| Non-static inner class | ❌ No (except `final static` constants and `main()` for JVM) | Tied to an instance          |
| Static nested class    | ✅ Yes                                                       | Behaves like top-level class |

---

### 🔹 Non-static Inner Class

```java
class Outer {
    class Inner {
        static int x = 10; // ❌ Compile-time error!
    }
}
```

#### ❗ Reason:

* Non-static inner classes are tied to an instance of the outer class.
* Static members belong to the class, **not the instance** — hence, not allowed.

---

### ✅ Exception: `main()` Method

```java
public class OuterClass {
    class InnerClass {
        public static void main(String[] args) {
            System.out.println("Inner class main method.");
        }
    }
}
```

* ✅ This works because `main()` is a special method invoked **only by the JVM** as an entry point.
* You can run it like:

  ```bash
  java OuterClass$InnerClass
  ```

---

### 🔹 Static Nested Class (Valid Usage)

```java
public class OuterClass {
    static class InnerClass {
        static int i = 10;

        public static void main(String[] args) {
            System.out.println("Static nested class main method");
            System.out.println(i);
        }
    }
}
```

✅ This compiles and runs without issue.

---

### ✅ Final Note

* Static methods (like `main`) in non-static inner classes are only allowed for **JVM entry**.
* All other static declarations must be inside a **static nested class**.

