// This rule is not applicable for the primitive datatypes.

class Parent
{
    public Object m1()
    {
        return null;
    }
}
class Child1 extends Parent
{
    public String m1()
    {
        return "String";
    }
}
class Child2 extends Parent
{
    public StringBuffer m1()
    {
        return new StringBuffer("StringBuffer");
    }
}


public class Rule2 {
    public static void main(String[] args) 
    {
        Parent p=new Parent();
        System.out.println(p.m1());

        Child1 c1=new Child1();
        System.out.println(c1.m1());

        Child2 c2=new Child2();
        System.out.println(c2.m1());
    }
}
