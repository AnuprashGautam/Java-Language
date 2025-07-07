public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Thread t=new Thread();
        t.setPriority(4);
        t.setPriority(14);
    }
}
