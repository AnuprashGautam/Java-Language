# ReadArrayFromKeyboard

## Overview

This Java program demonstrates how to read input from the keyboard using the `Scanner` class. The program takes an array size as input from the user, reads the specified number of integers into the array, and then prints the array elements. This is a fundamental example of handling user input and working with arrays in Java.

## Code Explanation

Here's the Java code:

```java
import java.util.Scanner;

public class ReadArrayFromKeyboard {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 3: Create the array of the specified size
        int[] array = new int[size];

        // Step 4: Use a loop to read the data into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 5: Print the array elements to verify the input
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
```

### Detailed Breakdown

1. **Import the Scanner Class**: 
   ```java
   import java.util.Scanner;
   ```
   This imports the `Scanner` class, which is used to read input from the keyboard.

2. **Create a Scanner Object**:
   ```java
   Scanner scanner = new Scanner(System.in);
   ```
   The `Scanner` object is created to read input from the standard input stream (keyboard).

3. **Prompt for Array Size**:
   ```java
   System.out.print("Enter the size of the array: ");
   int size = scanner.nextInt();
   ```
   The program prompts the user to enter the size of the array and reads the input using `scanner.nextInt()`.

4. **Create an Array**:
   ```java
   int[] array = new int[size];
   ```
   An array of integers with the specified size is created.

5. **Read Array Elements**:
   ```java
   System.out.println("Enter " + size + " elements:");
   for (int i = 0; i < size; i++) {
       array[i] = scanner.nextInt();
   }
   ```
   The program prompts the user to enter the elements of the array. A `for` loop is used to read each element and store it in the array.

6. **Print Array Elements**:
   ```java
   System.out.println("The array elements are:");
   for (int i = 0; i < size; i++) {
       System.out.print(array[i] + " ");
   }
   ```
   Another `for` loop is used to print the elements of the array to verify the input.

7. **Close the Scanner**:
   ```java
   scanner.close();
   ```
   The `scanner.close()` method is called to close the `Scanner` object and free the associated resources.

## Running the Program

To run the program, follow these steps:

1. Save the code to a file named `ReadArrayFromKeyboard.java`.
2. Open a terminal and navigate to the directory containing the file.
3. Compile the program using the command:
   ```
   javac ReadArrayFromKeyboard.java
   ```
4. Run the compiled program using the command:
   ```
   java ReadArrayFromKeyboard
   ```
5. Follow the prompts to enter the size of the array and its elements.

This program is a simple yet effective example of how to read and process user input in Java, and it serves as a good starting point for understanding array manipulation and input handling.