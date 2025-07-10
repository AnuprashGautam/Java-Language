public class SystemThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();

        Thread[] threadArray=new Thread[system.activeCount()];
        system.enumerate(threadArray);

        for(Thread t: threadArray)
        {
            System.out.println(t.getName()+"-------"+t.isDaemon());
        }
    }
}
