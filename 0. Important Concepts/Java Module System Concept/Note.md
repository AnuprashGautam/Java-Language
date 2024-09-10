# What is the Java Module System?

The Java Module System, introduced in Java 9, is a way to modularize applications, making them easier to manage and scale. Here are the key concepts and features:

### Key Concepts

1. **Module**: A module is a named, self-describing collection of code and data. It has a unique name and contains packages and resources.

2. **module-info.java**: Each module has a `module-info.java` file, which declares the module's name and dependencies. This file is placed at the root of the module’s directory structure.

3. **Exporting Packages**: Modules can export packages to make them accessible to other modules. If a package is not exported, it is encapsulated within the module.

4. **Requiring Modules**: A module can declare dependencies on other modules using the `requires` keyword.

### Features

1. **Encapsulation**: Modules allow better encapsulation by controlling which parts of the code are accessible to other modules.

2. **Strong Dependencies**: Modules explicitly declare dependencies, making it clear what each module depends on.

3. **Improved Maintainability**: By breaking an application into modules, it becomes easier to manage and maintain. Each module can be developed, tested, and maintained independently.

4. **Performance**: The module system can improve application performance by allowing the JVM to optimize the application start-up and memory usage.

### Example

Here's a simple example of how to define a module:

#### Module Definition (module-info.java)
```java
module com.example.myapp {
    requires java.logging;
    exports com.example.myapp.api;
}
```

In this example:
- `com.example.myapp` is the module name.
- It requires the `java.logging` module.
- It exports the `com.example.myapp.api` package, making it accessible to other modules.

#### Directory Structure
```
myapp
 ├── module-info.java
 └── com
     └── example
         └── myapp
             ├── api
             │   └── MyApiClass.java
             └── internal
                 └── MyInternalClass.java
```

### Using the Module System

To compile and run a modular application, you can use the `javac` and `java` commands with module-related options:

#### Compilation
```sh
javac -d out --module-source-path src $(find src -name "*.java")
```

#### Running
```sh
java --module-path out -m com.example.myapp/com.example.myapp.MainClass
```

The Java Module System is a powerful feature that brings better structure, encapsulation, and dependency management to Java applications.