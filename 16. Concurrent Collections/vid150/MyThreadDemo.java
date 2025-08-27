package vid150;
import java.util.ArrayList;
import java.util.Iterator;

public class MyThreadDemo extends Thread {

    static ArrayList l=new ArrayList();

    public void run()
    {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Child Thread is trying to update the array list:---");
        l.add("D");
    }

    public static void main(String[] args) {
        l.add("A");
        l.add("B");
        l.add("C");
        
        MyThreadDemo t=new MyThreadDemo();
        t.start();

        Iterator itr=l.iterator();

        System.out.println("Parent is trying to access the array list objects:---");
        try
        {
            Thread.sleep(3000);
            while (itr.hasNext()) {
                String s=(String)itr.next();
                System.out.println(s);
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
