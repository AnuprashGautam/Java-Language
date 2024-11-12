package mypackage;

public class Employee {
    private int id;
    Person person; // Reference to the Person class in the same package

    public Employee(int id, String name) {
        this.id = id;
        this.person = new Person(name); // Accessing default constructor of Person
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        person.displayInfo(); // Accessing default method of Person
    }
}
