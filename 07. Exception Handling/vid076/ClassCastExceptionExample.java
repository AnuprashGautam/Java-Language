public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // String s=new String("Hello World");
        // Object o=(Object)s;

        // Object o=new String("Hello World");
        // String s=(String)o;

        Object o=new Object();
        String s=(String)o;
    }
}
