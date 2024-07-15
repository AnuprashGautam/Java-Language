// Base interface
interface Base {
    void baseMethod();
}

// Derived interface 1
interface Derived1 extends Base {
    void derived1Method();
}

// Derived interface 2
interface Derived2 extends Base {
    void derived2Method();
}

// Implementing class
class ConcreteClass implements Derived1, Derived2 {
    @Override
    public void baseMethod() {
        System.out.println("Base method implementation");
    }

    @Override
    public void derived1Method() {
        System.out.println("Derived1 method implementation");
    }

    @Override
    public void derived2Method() {
        System.out.println("Derived2 method implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.baseMethod();
        obj.derived1Method();
        obj.derived2Method();
    }
}
