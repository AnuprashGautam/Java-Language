// In Overriding, method resolution is take care by the JVM according to the runtime object. Overriding is also called Late binding, Runtime Polymorphism, or Dynamic Polymorphism.

class Parent
{
    public void property()
    {
        System.out.println("Gold");
    }
    public void marry()         // Overridden method
    {
        System.out.println("Subhalaxmi");
    }
}

class Child extends Parent
{
    public void marry()         // Overriding method
    {
        System.out.println("Treesha");
    }
}

public class OverridingExample 
{
    public static void main(String[] args) {
        Parent p=new Parent();
        p.marry();

        Child c=new Child();
        c.marry();

        Parent pc=new Child();
        pc.marry();
    }
}
