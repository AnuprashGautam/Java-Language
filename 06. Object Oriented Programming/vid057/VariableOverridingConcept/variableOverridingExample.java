//Overriding concept is only applicable to the methods not to the variables. Variable resolution is takes care by the compiler according the reference type.


class Parent 
{
    static int x=888;
}

class Child extends Parent
{
    static int x=999;
}

public class variableOverridingExample {
    public static void main(String[] args) {
        Parent p= new Parent();
        System.out.println(p.x);

        Child c=new Child();
        System.out.println(c.x);

        Parent pc=new Child();
        System.out.println(pc.x);
    }
}
