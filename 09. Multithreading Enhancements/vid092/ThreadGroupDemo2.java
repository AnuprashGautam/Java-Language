public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("MyThreadGroup");

        Thread t1=new Thread(tg,"Thread1");
        Thread t2=new Thread(tg,"Thread2");

        System.out.println(tg.getMaxPriority());

        tg.setMaxPriority(3);

        Thread t3=new Thread(tg, "Thread3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println("----------------ThreadGroup class Methods-------------------");

        System.out.println(tg.getParent().getName());
        tg.list();
        System.out.println("Active threads:"+tg.activeCount());
        System.out.println("Active thread groups:"+tg.activeGroupCount());

        Thread[] threadArray=new Thread[10];
        t1.start();
        t2.start();
        
        tg.enumerate(threadArray);
        System.out.println(threadArray[0]);
        System.out.println(threadArray[1]);
        System.out.println(threadArray[2]);

        Thread[] threadArray1=new Thread[10];
        Thread.currentThread().getThreadGroup().getParent().enumerate(threadArray1);
        System.out.println("*******");
        for(Thread t:threadArray)
        {
            System.out.println(t);
        }


    }
}
