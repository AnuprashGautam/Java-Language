public class RightShiftExample {
    public static void main(String[] args) {
        int x = -8;  // Binary: 11111111111111111111111111111000
        x >>= 2;     // Right shift by 2 positions, preserving the sign
                     // Resulting binary: 11111111111111111111111111111110 (still negative)
        System.out.println(x);  // Output: -2
    }
}
