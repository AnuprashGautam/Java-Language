abstract class vehicle
{
    //If a class contain a abstract method, then it is must to declare the class abstarct because its implementation is not yet completed.
    //Abstract may have zero abstract method.

    abstract public void numberOfWheels();
}


class Bus extends vehicle
{
    public void numberOfWheels()
    {
        System.out.println("No the wheels in Bus : 6");
    }
}


public class AbstractMethodExample extends vehicle
{
    public void numberOfWheels()
    {
        System.out.println("No the wheels in Bus : 4");
    }
    public static void main(String[] args) 
    {
        System.out.println("If a class contain a abstract method, then it is must to declare the class abstarct because its implementation is not yet completed.Abstract may have zero abstract method.");
    }
}


