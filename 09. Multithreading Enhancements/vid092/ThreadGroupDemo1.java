public class ThreadGroupDemo1 {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("FirstGroup");
        System.out.println(tg.getParent().getName());

        ThreadGroup tg1=new ThreadGroup(tg,"SecondGroup");
        System.out.println(tg1.getParent().getName());
    }
}
