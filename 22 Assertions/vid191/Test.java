public class Test {
    public static void main(String[] args) {
        boolean assertOn = false;

        assert (assertOn) : assertOn = true;

        if (assertOn) {
            System.out.println(assertOn);
        }
    }
}