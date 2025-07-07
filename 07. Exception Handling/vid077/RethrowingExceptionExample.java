public class RethrowingExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            throw new NullPointerException();
        }
    }
}
