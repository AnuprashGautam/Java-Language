// While resolving overloading methods, compiler will always give preferenvce to child type arguement compared to parent type arguement.

public class Case2 
{
    public void m1( Object o)  // Parent
    {
        System.out.println("Object Version");
    }

    public void m1(String s)  // Child
    {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        Case2 c=new Case2();
        c.m1(new Object());
        c.m1("Ram");
        c.m1(null);
    }
}

