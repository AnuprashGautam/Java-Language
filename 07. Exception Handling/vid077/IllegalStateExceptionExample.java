public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        Thread t=new Thread();
        t.start();


        t.start();
    }
}
