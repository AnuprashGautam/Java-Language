class parent
{
    public static void main(String[] args) {
        System.out.println("Parent class main method");
    }
}


public class StaticModifierExample3 extends parent
{
    // Inheritence concept is applicable for the main method too. But the JVM always calls the main method of the child class if the child class doesn't contain the main method then the parent class main method will be called.
}
