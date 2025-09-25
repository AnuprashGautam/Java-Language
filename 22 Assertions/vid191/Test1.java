public class Test1 {
    public static void main(String[] args) {
        
        int x=10;

        try {
            assert(x>10);
        } catch (AssertionError e) {
            System.out.println("I am stupid that i am catching the assertion exception.");
        }
    }
}