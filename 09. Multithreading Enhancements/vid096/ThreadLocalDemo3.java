class ParentThread extends Thread{
    // public static ThreadLocal tl=new ThreadLocal<>();
    public static InheritableThreadLocal tl=new InheritableThreadLocal<>(){
        public Object childValue(Object p)
        {
            return "cc";
        }
    };

    public void run()
    {
        tl.set("pp");
        System.out.println("Parent Thread Local Variable accessing by the parent thread itself: "+tl.get());
        ChildThread ct=new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread{
    public void run()
    {
        System.out.println("Parent Thread Local Variable accessing by the parent thread itself: "+ParentThread.tl.get());
    }
}

public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        ParentThread t=new ParentThread();
        t.start();
    }
}
