class ClassA{
    public synchronized void d1(ClassB b)
    {
        System.out.println("Running the class A d1() method.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("Calling the class B last method : ");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Inside class A, this is the last method.");
    }
}

class ClassB{
    public synchronized void d2(ClassA a)
    {
        System.out.println("Running the class B d2() method.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("Calling the class A last method : ");
        a.last();
    }

    public synchronized void last(){
        System.out.println("Inside class B, this is the last method.");
    }
}

public class DeadLockDemo extends Thread {
    ClassA a=new ClassA();
    ClassB b=new ClassB();

    public void m1(){
        this.start();
        a.d1(b);            // Executed by the main thread.
    }

    public void run(){
        b.d2(a);            // Executed by the child thread.
    }

    public static void main(String[] args) {
        DeadLockDemo d=new DeadLockDemo();
        d.m1();
    }
}
