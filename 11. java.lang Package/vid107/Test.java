public class Test{
    public static void main(String[] args) {
        String s1=new String();
        String s2=new String("String Literal");
        String s3=new String(new StringBuffer("String Buffer"));
        char[] c={'a','b','c','d'};
        String s4=new String(c);
        byte[] b={100,101,102,103};
        String s5=new String(b);
    }
}