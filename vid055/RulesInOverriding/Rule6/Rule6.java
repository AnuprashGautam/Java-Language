abstract class Parent
{
    abstract public void m1();
}

abstract class Child extends Parent
{
    abstract public void m1();
}

class SubChild extends Child
{
    public void m1()
    {
        System.out.println("Implementation provided.");
    }
}

public class Rule6 
{
    public static void main(String[] args) {
        Parent p=new SubChild();
        p.m1();
    }
}
