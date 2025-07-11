import java.security.cert.LDAPCertStoreParameters;
import java.util.concurrent.locks.ReentrantLock;

class Display{
    ReentrantLock l=new ReentrantLock();
    public void wish(String name)
    {
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println(name);
        }
        l.unlock();
    }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name)
    {
        this.name=name;
        this.d=d;
    }
    public void run()
    {
        d.wish(name);
    }
}

public class ReentrantLockDemo1{
    public static void main(String[] args) {
        Display d=new Display();

        MyThread t1=new MyThread(d, "Rajive");
        MyThread t2=new MyThread(d, "Rahul");
        
        t1.start();
        t2.start();
    }
}