package mypackage;


class Person {
    // Default access modifier
    String name;

    // Constructor with default access
    Person(String name) {
        this.name = name;
    }

    // Default access method
    void displayInfo() {
        System.out.println("Person's Name: " + name);
    }
}
