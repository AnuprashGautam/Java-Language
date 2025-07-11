import java.security.cert.LDAPCertStoreParameters;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{
    static ReentrantLock l=new ReentrantLock();
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        do{
            try {
                if(l.tryLock(5000, TimeUnit.MILLISECONDS))
                {
                    System.out.println(Thread.currentThread().getName()+"--- got the lock and now it is performing the safe operations.");
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                    }
                    l.unlock();
                    System.out.println(Thread.currentThread().getName()+"-- releases the lock.");
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName()+"--- did not got the lock and now i will try again.");
                }
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }while(true);
    }
}

public class ReentrantLockDemo3{
    public static void main(String[] args) {
        Display d=new Display();

        MyThread t1=new MyThread("First");
        MyThread t2=new MyThread("Second");
        
        t1.start();
        t2.start();
    }
}