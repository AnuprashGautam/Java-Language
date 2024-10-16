public class UnsignedRightShiftExample {
    public static void main(String[] args) {
        int x = -8;  // Binary: 11111111111111111111111111111000
        x >>>= 2;    // Unsigned right shift by 2 positions
                     // Resulting binary: 00111111111111111111111111111110 (positive)
        System.out.println(x);  // Output: 1073741822
    }
}
