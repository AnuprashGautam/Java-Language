import java.security.cert.LDAPCertStoreParameters;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{
    static ReentrantLock l=new ReentrantLock();
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        if(l.tryLock())
        {
            System.out.println(Thread.currentThread().getName()+"--- got the lock and now it is performing the safe operations.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            l.unlock();
        }
        else{
            System.out.println(Thread.currentThread().getName()+"--- did not got the lock and now it is performing the alternative operations.");
        }
    }
}

public class ReentrantLockDemo2{
    public static void main(String[] args) {
        Display d=new Display();

        MyThread t1=new MyThread("First");
        MyThread t2=new MyThread("Second");
        
        t1.start();
        t2.start();
    }
}