public class ParseXxxDemo {
    public static void main(String[] args) {
        int i=Integer.parseInt("123");
        // int i1=Integer.parseInt("two");   // NumberFormatException
        int i2=Integer.parseInt("1213",4);

        boolean b=Boolean.parseBoolean("true");
        float f=Float.parseFloat("12.5");
    }
}
