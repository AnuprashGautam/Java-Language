Sure, let's create a practical example with three Java files to demonstrate the default access modifier. We'll have:

1. A file with a class that uses the default access modifier.
2. Another file within the same package to access the default class.
3. A file from a different package attempting to access the default class.

### Step 1: Create the Default Class
**File: DefaultClass.java**
```java
package com.example;

class DefaultClass {
    void display() {
        System.out.println("Default access modifier in action!");
    }
}
```

### Step 2: Access the Default Class from the Same Package
**File: AccessWithinPackage.java**
```java
package com.example;

public class AccessWithinPackage {
    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.display(); // This will work as it's within the same package
    }
}
```

### Step 3: Attempt to Access the Default Class from a Different Package
**File: AccessOutsidePackage.java**
```java
package com.another;

import com.example.DefaultClass; // This import will cause an error

public class AccessOutsidePackage {
    public static void main(String[] args) {
        // This will cause a compilation error
        // DefaultClass defaultClass = new DefaultClass();
        // defaultClass.display();
        
        System.out.println("Cannot access DefaultClass from a different package");
    }
}
```

### Directory Structure:
```
src
├── com
│   └── example
│       ├── DefaultClass.java
│       └── AccessWithinPackage.java
└── com
    └── another
        └── AccessOutsidePackage.java
```

### Compilation and Execution:
1. Navigate to the `src` directory.
2. Compile the Java files:
   ```sh
   javac com/example/DefaultClass.java com/example/AccessWithinPackage.java com/another/AccessOutsidePackage.java
   ```
3. Run the classes:
   ```sh
   java com.example.AccessWithinPackage
   java com.another.AccessOutsidePackage
   ```

### Expected Output:
1. **AccessWithinPackage**:
   ```
   Default access modifier in action!
   ```
2. **AccessOutsidePackage**:
   ```
   Cannot access DefaultClass from a different package
   ```

### Explanation:
- `DefaultClass` has a default access modifier, making it accessible only within the `com.example` package.
- `AccessWithinPackage` is able to create an instance of `DefaultClass` and call its `display` method because it is within the same package.
- `AccessOutsidePackage` cannot access `DefaultClass` because it resides in a different package, and trying to import or use `DefaultClass` will result in a compilation error.

This setup demonstrates how the default access modifier controls the visibility of classes and members within the same package while restricting access from other packages.