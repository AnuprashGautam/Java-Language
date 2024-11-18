//*Overloading is the concept of polymorphism in JAVA. In which the multiple methods with same name but different arguements are allowed. It reduce the complexity of the programming. Method resolution is takes care by the compiler according to the reference type. It is also called static binding, compiletime polymorphism, or early binding.*//

public class OverloadingExample 
{
    public int abs(int i)
    {
        return Math.abs(i);
    }

    public float abs(float f)
    {
        return Math.abs(f);
    }

    public long abs(long l)
    {
        return Math.abs(l);
    }

    public double abs(double d)
    {
        return Math.abs(d);
    }

    public static void main(String[] args) {
        OverloadingExample o=new OverloadingExample();
        System.out.println(o.abs(-5));
        System.out.println(o.abs(-8.9));
        System.out.println(o.abs(10l));
        System.out.println(o.abs(-89.90));
    }
}
