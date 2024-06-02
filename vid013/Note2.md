# What is the meaning of `Parent childAsParent = new Child();` in Java?

```java
Parent childAsParent = new Child();
```

### Explanation

1. **Reference Type**: `Parent`
   - `Parent` is the type of the reference `childAsParent`. This means that `childAsParent` can only call methods that are defined in the `Parent` class.

2. **Object Type**: `Child`
   - `new Child()` creates an instance of the `Child` class. This is the actual object that `childAsParent` refers to.

### Key Concepts

- **Reference Type vs. Object Type**:
  - The **reference type** determines what methods and properties can be accessed.
  - The **object type** is the actual type of the instance created.

- **Static Method Resolution**:
  - For static methods, Java resolves which method to call at compile time based on the reference type, not the object type.

### Application in Method Hiding

When calling a static method using the `childAsParent` reference:

```java
childAsParent.display();
```

- **Reference Type**: `Parent`
  - Java looks at the reference type (`Parent`) to decide which `display` method to call.
  - Since the reference type is `Parent`, Java calls the `display` method defined in the `Parent` class, not the one in the `Child` class.

### Summary

So, the line `Parent childAsParent = new Child();` creates a situation where:

- The reference type is `Parent`.
- The object type is `Child`.

When calling static methods, Java uses the reference type (`Parent` in this case) to determine which method to call. Therefore, `childAsParent.display();` calls the `Parent` class's `display` method.