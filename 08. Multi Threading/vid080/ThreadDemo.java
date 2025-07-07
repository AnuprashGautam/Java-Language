class MyRunnable implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo{
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);         // Target Runnable is MyRunnable.

        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
