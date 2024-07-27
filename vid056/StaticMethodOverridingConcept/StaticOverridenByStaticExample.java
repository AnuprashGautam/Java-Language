class Parent
{
    public static void m1()
    {

    }
}
 class StaticOverridenByStaticExample extends Parent         // Child class
{
    public static void m1()
    {

    }
    public static void main(String[] args) {
        System.out.println("Static method overriden by static method: Method Hiding");
    }
}
