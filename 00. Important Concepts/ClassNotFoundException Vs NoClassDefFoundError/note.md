The main difference between `ClassNotFoundException` and `NoClassDefFoundError` in Java lies in when and why they occur:

### 1. **ClassNotFoundException**
   - **Type**: **Checked Exception**
   - **When it occurs**: It occurs when an application tries to load a class dynamically at runtime using methods like `Class.forName()`, `ClassLoader.loadClass()`, or `ClassLoader.findSystemClass()` but the class is not found in the classpath.
   - **Why it occurs**: This happens if the specified class cannot be found, but the class was never explicitly loaded before. This is a recoverable situation if the missing class is loaded later or if the application handles the exception appropriately.
   - **Handling**: Since it is a checked exception, it must either be caught or declared in the method signature using `throws`.
   - **Example**:
     ```java
     try {
         Class.forName("com.example.NonExistentClass");
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }
     ```

### 2. **NoClassDefFoundError**
   - **Type**: **Error** (Unrecoverable, part of the `Error` hierarchy)
   - **When it occurs**: It occurs when the JVM or a ClassLoader tries to load a class that was present at compile-time but is not found when the JVM attempts to use it at runtime.
   - **Why it occurs**: This generally happens if the class was successfully compiled but is missing from the classpath at runtime. It might also occur if the class was not successfully loaded earlier due to some error during its initial static initialization or loading.
   - **Handling**: As it's an `Error`, it's usually not recoverable, and applications are not expected to catch or handle it under normal circumstances.
   - **Example**:
     ```java
     public class TestClass {
         public static void main(String[] args) {
             MyClass obj = new MyClass(); // If MyClass is missing at runtime, this will throw NoClassDefFoundError
         }
     }
     ```

### Key Differences:
| Feature                | `ClassNotFoundException`                              | `NoClassDefFoundError`                          |
|------------------------|------------------------------------------------------|------------------------------------------------|
| **Type**               | Checked Exception                                    | Error                                          |
| **Occurs When**        | Class is dynamically loaded at runtime but not found | Class is present at compile-time but missing at runtime |
| **Cause**              | Typically occurs during class loading with reflection or dynamic loading | Typically occurs when the classpath is incomplete or during static initialization |
| **Handling**           | Must be caught or declared                            | Rarely caught, considered a serious problem    |

In short, `ClassNotFoundException` happens when a class is being loaded dynamically and is not found, while `NoClassDefFoundError` happens when the class was available during compilation but is missing during runtime execution.