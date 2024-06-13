class parent
{
    public static void main(String[] args) {
        System.out.println("Parent class main method");
    }
}


public class StaticModifierExample4 extends parent
{
    // It looks like method overriding but it is not. It is method hiding.

    public static void main(String[] args) {
        System.out.println("Child class main method");
    }
}
