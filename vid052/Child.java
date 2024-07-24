//Multiple inheritance is not allowed for classes in JAVA, multi-level inheritance is allowed for classes.

class Parent
{
    public void property()
    {
        System.out.println("Gold Silver");
    }

    public void marriage()
    {
        System.out.println("Subha Laxmi");
    }
}


public class Child extends Parent
{
    public void vehicle()
    {
        System.out.println("Car");
    }

    public void property()
    {
        System.out.println("Gold Silver Diamond");
    }

    public void marriage()
    {
        System.out.println("Tressha");
    }
    public static void main (String[] args)
    {
        Parent p=new Parent();
        p.property();
        p.marriage();

        Child c=new Child();
        c.property();
        c.marriage();
        c.vehicle();

        Parent p1=new Child();  //It provides only those methods which are declared in parent class and the implementations are taken from the child class.
        p1.property();
        p1.marriage();
    }
}