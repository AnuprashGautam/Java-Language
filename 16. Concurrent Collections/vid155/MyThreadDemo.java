import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThreadDemo extends Thread {

    static ConcurrentHashMap chm=new ConcurrentHashMap<>();

    public void run()
    {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Child Thread is trying to update the concurrent hash map:---");
        chm.replace(1,"A","Z");
    }

    public static void main(String[] args) {
         chm.put(1,"A");
         chm.put(2,"B");
         chm.put(3,"C");
        
        MyThreadDemo t=new MyThreadDemo();
        t.start();

        Set s=chm.keySet();
        Iterator itr=s.iterator();

        System.out.println("Parent is trying to access the concurrent hash map:---");
        try
        {
            while (itr.hasNext()) {
                System.out.println(chm.get(itr.next()));
                Thread.sleep(2000);
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
