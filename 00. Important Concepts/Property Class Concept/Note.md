# Property Class in Java

This repository provides a simple example of a Property Class in Java, demonstrating the principles of encapsulation with private fields and public getter and setter methods.

## Overview

A Property Class in Java is a class that contains private fields (properties) and provides public methods to access and modify these properties. This approach helps in encapsulating the data and controlling how it's accessed and updated.

## Example: Person Class

The `Person` class in this example has two properties: `name` and `age`. These properties are private fields, meaning they can only be accessed within the class. The class provides public getter and setter methods to access and modify these properties.

### Code

```java
public class Person {
    // Private fields (properties)
    private String name;
    private int age;

    // Constructor to initialize the properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // A method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Anuprash Gautam", 20);

        // Display the initial information
        person.displayInfo();

        // Update the person's age
        person.setAge(21);

        // Display the updated information
        person.displayInfo();
    }
}
