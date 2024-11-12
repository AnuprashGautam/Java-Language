public class FinalLocalVariableExample1 {
    public static void main(String[] args) {
        // For local variable JVM don't provide default value.
        // But if we are not using the uninitialised local variable, then we will not
        // get compile time error.
        // Eventhough local variable (uninitialised) is final and have not been used, even then we will not get compile time error.
        //Only applicable modifier for local variable is final.

        final int x;
        System.out.println("Hello");
        // System.out.println(x);
    }
}
