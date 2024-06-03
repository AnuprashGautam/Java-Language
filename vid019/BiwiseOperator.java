public class BiwiseOperator {
    public static void main(String[] args) {
        //This operator can be applied on integral datatypes, boolean, but not on floating point.
        System.out.println(true&true);
        System.out.println(true|false);
        System.out.println(true^false);

        System.out.println(4^5);
        System.out.println(5|4);
        System.out.println(5&4);

        System.out.println(~4);
        System.out.println(~-5);

    }
}
