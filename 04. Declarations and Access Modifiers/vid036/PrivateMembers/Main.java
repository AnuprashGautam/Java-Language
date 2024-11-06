// Abstract class with an abstract method
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Non-abstract method (can have a body)
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    // Private method (not accessible to subclasses)
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    // The subclass provides the implementation for the abstract method
    public void makeSound() {
        System.out.println("The dog says: Woof woof");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println("The dog is fetching the ball.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the method defined in Dog
        myDog.sleep();     // Calls the method inherited from Animal
        myDog.fetch();     // Calls the method defined in Dog

        // Trying to call privateMethod() would result in a compile-time error
        // myDog.privateMethod(); // This line would cause an error
    }
}
