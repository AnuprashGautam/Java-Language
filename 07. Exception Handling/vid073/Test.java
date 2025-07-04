public class Test {
    public static void main(String[] args) {
        // System.out.println(10/0);
        throw new ArithmeticException("I can not do this division because you are trying to divide the number by zero.");
    }
}
