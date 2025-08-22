### ✅ **What is `Spliterator` in Java?**

In simple terms, `Spliterator` stands for **Split + Iterator**.
It is an advanced iterator introduced in Java 8 that **traverses and partitions** elements of a **collection** efficiently, especially for **parallel processing**.

---

### 🔍 **Key Features of `Spliterator`**

| Feature                  | Description                                                          |
| ------------------------ | -------------------------------------------------------------------- |
| ✅ **Traversing**         | Like `Iterator`, it can iterate over a collection.                   |
| 🔄 **Splitting**         | It can split itself into multiple parts for **parallel processing**. |
| 🧠 **Characterized**     | It tells us characteristics (like ORDERED, SORTED) of the data.      |
| 🧵 **Used with Streams** | Java uses `Spliterator` internally in parallel streams.              |

---

### 🛠️ **Basic Methods of `Spliterator`**

| Method                                           | Description                                                        |
| ------------------------------------------------ | ------------------------------------------------------------------ |
| `boolean tryAdvance(Consumer<? super T> action)` | Processes one element at a time. Returns `false` when done.        |
| `Spliterator<T> trySplit()`                      | Splits the data into another `Spliterator` (used for parallelism). |
| `long estimateSize()`                            | Returns approx. number of elements left.                           |
| `int characteristics()`                          | Returns characteristics of elements like ORDERED, SORTED, etc.     |

---

### ✅ **Example: Using `Spliterator`**

```java
import java.util.*;
import java.util.stream.*;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> names = List.of("Anu", "Prash", "Gautam", "Java", "Spring");

        // Get Spliterator
        Spliterator<String> spliterator = names.spliterator();

        // Estimate size
        System.out.println("Estimated Size: " + spliterator.estimateSize());

        // Get characteristics
        System.out.println("Characteristics: " + spliterator.characteristics());

        // Try splitting
        Spliterator<String> split1 = spliterator.trySplit();

        System.out.println("\nOutput from split1:");
        split1.forEachRemaining(System.out::println);

        System.out.println("\nOutput from original spliterator:");
        spliterator.forEachRemaining(System.out::println);
    }
}
```

---

### 📌 **Output:**

```
Estimated Size: 5
Characteristics: 16464

Output from split1:
Anu
Prash

Output from original spliterator:
Gautam
Java
Spring
```

---

### 💡 **How to understand splitting?**

* First `Spliterator` tries to **divide the workload** (`trySplit()`).
* Each piece can then **work in parallel**, which is helpful when using **parallel streams**.

---

### 🧠 **Common Characteristics Flags**

| Constant     | Meaning                       |
| ------------ | ----------------------------- |
| `ORDERED`    | Elements have a defined order |
| `DISTINCT`   | No duplicates                 |
| `SORTED`     | Elements are sorted           |
| `SIZED`      | Knows exact size              |
| `NONNULL`    | No null elements              |
| `IMMUTABLE`  | Source can't be changed       |
| `CONCURRENT` | Can be modified concurrently  |

You can check them like this:

```java
if ((spliterator.characteristics() & Spliterator.ORDERED) != 0) {
    System.out.println("The elements are ordered.");
}
```

---

### ⚙️ **Where is `Spliterator` used in real life?**

* Internally in **parallel streams**:

```java
List<String> list = List.of("A", "B", "C", "D", "E");

// Internally uses Spliterator to divide work
list.parallelStream().forEach(System.out::println);
```

---

### 📦 Summary

| Point             | Description                     |
| ----------------- | ------------------------------- |
| 🎯 Purpose        | Efficient traversal + splitting |
| ⚙️ Major Use      | Parallel stream processing      |
| 💡 Unique Ability | Can split collections           |
| 🔁 tryAdvance     | Traverse one-by-one             |
| 🔀 trySplit       | Divide work                     |

---

Would you like an example using a **custom collection** or how it works with **parallel streams internally**?
