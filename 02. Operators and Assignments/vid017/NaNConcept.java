public class NaNConcept {
    public static void main(String[] args) {
        // System.out.println(0/0);                             //No way to represent the undefined result in integer arithmetic
        System.out.println(0.0/0);                              //But in floating point arithmetic there is a constant NaN.
        System.out.println(-0.0/0);
        int x=10;
        boolean r=x!=Float.NaN;
        System.out.println(Float.NaN==Float.NaN);
        System.out.println(Float.NaN!=Float.NaN);
        System.out.println(r);                                 //Only case of comparison with NaN, answer is true for any arbitarary value of x including NaN.
    }
}