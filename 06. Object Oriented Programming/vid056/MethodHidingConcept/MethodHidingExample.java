// In method hiding, method resolution is takes care by the compiler based on the reference type. It is also called static polymorphisim, early binding, and compiletime polymorphism. In method hinding, methods are just hidden, they are not overwritten.
class Parent
{
    public static void marry()
    {
        System.out.println("Subhalakshmi");
    }
}

class Child extends Parent
{
    public static void marry() 
    {
        System.out.println("Treesha");
    }
}

public class MethodHidingExample 
{
    public static void main(String[] args) {
        Parent p=new Parent();
        p.marry();

        Child c=new Child();
        c.marry();

        Parent p1=new Child();
        p1.marry();
    }
}
