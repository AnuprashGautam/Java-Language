public class FinalLocalVariableExample2 {

    public static void m1(final int x, final int y) {
        // x = 100; // Compile time error
        // y = 200; // Compile time error
        System.out.println(x+y);
    }
    public static void main(String[] args) 
    {
        // Formal parameter is also a local variable. So if we have declared them as final, then we can't reassign them.
        m1(10,20);                              //Actual arguments
    }
}
