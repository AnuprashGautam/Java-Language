public class Integral_Literals {
    public static void main(String[] args) {
        
        int x_dec=10;
        int x_oct=010;
        int x_hex=0X10;

        System.out.println(x_dec+"---"+x_oct+"---"+x_hex);

        // int y=0786;                        // Error: ; expected
        // int y=0x786ghs;                    // Error: ; expected

        long l1=1894l;
        long l2=1223L;

        // float f1=123.456;                   // CE: double can not be converted into float
        float f1=123.456f; 
        
        
        double d1=0345.67;
        double d2=0.0;
        // double d3=0xFace.90;             //CE: malformed floating point number
        double d4=1.2e4;
        //float f5=1.4e4;                   //CE: possible lossy conversion form double to float.

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d4);


    }
}
