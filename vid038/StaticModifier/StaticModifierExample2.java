public class StaticModifierExample2 {
    // Overloading concept is applicable for the main method too. But the JVM always calls the main method which receives String array as arguments only.
    public static void main(String[] args) {
        System.out.println("main with String[] args");
    }

    public static void main(int[] x) {
        System.out.println("main with int[] args");
    }
}
