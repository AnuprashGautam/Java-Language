public class ThreadDemo {
    public static void main(String[] args) {
        Thread t=new Thread();

        t.setPriority(7);
        // t.setPriority(14);

        System.out.println(t.MIN_PRIORITY);
        System.out.println(t.MAX_PRIORITY);
        System.out.println(t.NORM_PRIORITY);
        System.out.println(t.getPriority());
    }
}
