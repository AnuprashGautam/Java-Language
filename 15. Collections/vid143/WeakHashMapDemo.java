import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // HashMap m=new HashMap();
        Map m=new WeakHashMap();
        
        Temp t=new Temp();
        m.put(t, "Hello");
        System.out.println(m);
        t=null;
        System.gc();
        System.out.println("Thread is sleeping so that the garbage collector can do its work...zzzz");
        Thread.sleep(5000);
        System.out.println(m);
    }
}

class Temp {
    public String toString()
    {
        return "temp";
    }

    public void finalize()
    {
        System.out.println("Finalize method called.");
    }
}
