public class Test {

    // Widening 
    public static void m1(long l)
    {
        System.out.println("Widening");
    }

    // Autoboxing
    public static void m1(Integer I)
    {
        System.out.println("Autoboxing");
    }

    // Var-arg method
    public static void m1(int... i)
    {
        System.out.println("Var-arg method");
    }

    public static void main(String[] args) {
        int x=10;
        m1(x);
    }
}