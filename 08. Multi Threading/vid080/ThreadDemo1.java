class MyThread extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}


public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread t1=new Thread(t);
        // Thread t2=new Thread(t1);
        t1.start();

        System.out.println("Main Thread");
    }
}
