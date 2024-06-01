public class Integer_Literal {
    public static void main(String[] args) {
        int x_dec = 327;
        // int x_dec = 32787989687569;                  // Integer number too large
        int x_oct= 01765;
        // int x_oct = 01787;                        // Integer number too large
        int x_hex = 0xface;
        // int x_hex = 0xfare;                       // Compile time error : semicolon expected
        int x_bin = 0b101;

        long l1=10;
        long l2=10l;
        long l3=10L;
        long l4=01234;
        long l5=0x3242;
        int long_int=10;
        // int long_int=10l;                         // possible loss of precision

        byte b=127;
        // byte b1=128;                                  // possible loss of precision

        short s=32767;
        // short s1=32768;                             // possible loss of precision
        

        System.out.println("Integer decimal literal: " + x_dec);
        System.out.println("Integer octal literal: " +x_oct);
        System.out.println("Integer hex literal: " + x_hex);
        System.out.println("Integer binary literal: " + x_bin);
        System.out.println("Long literal: " + l1);
        System.out.println("Long literal: " + l2);
        System.out.println("Long literal: " + l3);
        System.out.println("Long literal: " + l4);
        System.out.println("Long literal: " + l5);
        System.out.println("Long int literal: " + long_int);
        System.out.println("Byte literal: " + b);
        System.out.println("Short literal: " + s);
    }
}
