public class Test2 {
    public static void main(String[] args) {
        // System.out.println(10/0);
        throw new ArithmeticException("/ by zero");
        System.out.println("This is the unreachable statement.");
    }
}
