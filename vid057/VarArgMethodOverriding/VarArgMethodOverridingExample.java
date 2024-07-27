// Var-arg method can only be overriden by var-arg method. If we are trying to do so with the normal method, then it is overloading, not overriding. 

class Parent
{
    public void m1(int ... x)
    {
        System.out.println("Parent method");
    }
}

class Child extends Parent
{
    public void m1(int x)
    {
        System.out.println("Child method");
    }
}
public class VarArgMethodOverridingExample 
{
    public static void main(String[] args) {
        Parent p=new Parent();
        p.m1(10);

        Child c=new Child();
        c.m1(10);
        c.m1();                                            //Special Case

        Parent pc=new Child();
        pc.m1(10);
    }
}
