abstract class Car {
    final public void seats()
    {
        System.out.println("Attleast $ seats are must.");
    }
    abstract public void wheels();
    abstract public void color();
    abstract public void speed();
}

//We must have to provide the implementation for each method , otherwise declare child class abstract.

class CarDetails extends Car {
    public void wheels() {
        System.out.println("No of wheels is: 4");
    }

    public void color() {
        System.out.println("Color of car is: Cyan");
    }

    public void speed() {
        System.out.println("Speed of car is: 440 mph");
    }
}

public class ChainAbstractExample {
    public static void main(String[] args) {
        Car myCar = new CarDetails();
        myCar.wheels();
        myCar.color();
        myCar.speed();
    }
}
