public class Floatingpoint_Literal {
    public static void main(String[] args) {
        // float f=12.3;                 // possible loss of precision 
        // float f=12.3d;                // possible loss of precision 

        // float f=0b12.3f;               // malformed floating point literal
        float f=0xbeef;
        float f1=1.2E4f;


        double d=0123.4;
        double d1=123.1d;
        double d2=1234.1f;
        double d3=0xbeef;
        double d4=1.2E4;

        System.out.println("Floating Literal:"+f);
        System.out.println("Floating Literal:"+f1);
        System.out.println("Double Literal:"+d);
        System.out.println("Double Literal:"+d1);
        System.out.println("Double Literal:"+d2);
        System.out.println("Double Literal:"+d3);
        System.out.println("Double Literal:"+d4);
    }
}
