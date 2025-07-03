class Parent {
    int x=100;
    int y=200;
}


public class Child extends Parent
{
    int x=10;
    int y=20;

    {
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(super.y);
        System.out.println(super.y);
        System.out.println(this.hashCode());
        System.out.println(super.hashCode());
    }
    public static void main (String[] args)
    {
        Child c=new Child();
    }
}