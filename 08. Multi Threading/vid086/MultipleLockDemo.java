class Y{

}

class Z{

}

class X{
    public synchronized void m1(){
        // Here thread has lock of X class only.
        Y y=new Y();
        synchronized(y)
        {
            // Here thread has locks of X and y.
            Z z =new Z();
            synchronized(z)
            {
                // Here thread has locks of X, y and z.
                System.out.println("Exceuting the synchronized block after getting the multiple locks by "+Thread.currentThread().getName());
            }
        }
    }
}

class MyThread extends Thread{
    X x=null;

    MyThread(X x)
    {
        this.x=x;
    }

    public void run() {
        x.m1();
    }
}

public class MultipleLockDemo{
    public static void main(String[] args) {
        X x=new X();
        
        MyThread t1=new MyThread(x);
        MyThread t2=new MyThread(x);

        t1.start();
        t2.start();
    }
}
