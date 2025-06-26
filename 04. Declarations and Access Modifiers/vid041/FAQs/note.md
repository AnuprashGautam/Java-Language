# Why it is impossible to implement the interfaces having the methods with same signature and differnet return type? Explain in easy waya so that I can understand it properly.


This is a very good question and quite common when learning **interfaces in Java**.

Let’s understand **why it is *not possible* to implement two interfaces with methods having the **same name and parameters** but **different return types**.**

---

### ✅ First, what is a method signature?

In Java, a **method signature** includes:

* Method name
* Number and type of parameters

👉 **It does NOT include the return type!**

So, for Java:

```java
void doSomething(int x)
```

and

```java
String doSomething(int x)
```

have the **same method signature**, even though the return types are different.

---

### 🧠 What happens when you implement two interfaces like this?

Let’s see an example:

```java
interface A {
    int getData();
}

interface B {
    String getData();
}

class MyClass implements A, B {
    // ???
}
```

Now when `MyClass` tries to implement both `A` and `B`, Java gets **confused**:

> Which version of `getData()` is correct? Should it return `int` or `String`?

Because both methods have the same signature (`getData()` with no parameters), Java **can’t distinguish** between them **based on return type alone**. And that's **not allowed** in Java.

---

### 🔥 Why doesn’t Java allow overloading by return type?

Imagine you try this:

```java
int x = obj.getData();      // Works if return is int
String y = obj.getData();   // Works if return is String
```

Java doesn’t know which one you meant — there’s **no way to decide** just based on the variable type on the left. That's why **Java doesn’t support method overloading only by return type.**

---

### 🛑 Summary:

* Java method **signature does not include return type**.
* You **can’t have two methods** with the **same name and parameters** but **different return types**.
* That’s why you **can’t implement two interfaces** that declare such methods — it would break the rules of the Java compiler.

---

### ✅ Solution or Alternative:

To avoid this problem:

* Use **different method names** in each interface.
* Or, if you control the interfaces, try to **merge or modify** them so that this conflict does not happen.

---

Let me know if you want a real code example with error and fix.
