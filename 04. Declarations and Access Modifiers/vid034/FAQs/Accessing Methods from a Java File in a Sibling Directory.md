Here's a concise and well-structured README file explaining how to access methods from a Java file in a sibling directory:

---

# Accessing Methods from a Java File in a Sibling Directory

This guide walks you through the process of accessing methods from a Java file located in a sibling directory. We'll cover creating the directory structure, using packages, importing classes, and compiling the program correctly.

## Directory Structure

Assume you have the following directory layout in your project:

```
project-root/
├── current-directory/
│   └── CurrentFile.java
└── sibling-directory/
    └── SiblingFile.java
```

The goal is to call a method from `SiblingFile.java` inside `CurrentFile.java`.

## Step-by-Step Guide

### 1. Declare Packages
Each Java file should be placed in a named package to facilitate importing classes.

**SiblingFile.java** should declare its package:
```java
package siblingDirectory;

public class SiblingFile {
    public void siblingMethod() {
        System.out.println("Method from sibling file!");
    }
}
```

Similarly, in **CurrentFile.java**, declare its package and import `SiblingFile`:
```java
package currentDirectory;

import siblingDirectory.SiblingFile;

public class CurrentFile {
    public static void main(String[] args) {
        SiblingFile siblingFile = new SiblingFile();
        siblingFile.siblingMethod();  // Access the method from SiblingFile.java
    }
}
```

### 2. Compile the Files
Navigate to the `project-root/` directory. Use the following command to compile both files:
```bash
javac current-directory/CurrentFile.java sibling-directory/SiblingFile.java
```

### 3. Run the Program
To run the program, ensure you're in the `project-root/` directory and use the `-cp` option to set the classpath. The `.` specifies the current directory as the base path for the package structure.

```bash
java -cp . currentDirectory.CurrentFile
```

### Explanation of `-cp .`
The `-cp` (or `-classpath`) option tells Java where to look for compiled `.class` files. The `.` indicates the current directory, so Java will find the relevant package directories (`current-directory/`, `sibling-directory/`) within `project-root/`.

## Conclusion
By organizing your Java files into packages, using imports, and specifying the classpath during compilation and execution, you can easily access methods from sibling directories. This structure is vital for modular, scalable Java projects.

--- 

This README provides a clean, practical explanation of how to organize and compile Java files across directories. Let me know if you need any adjustments!