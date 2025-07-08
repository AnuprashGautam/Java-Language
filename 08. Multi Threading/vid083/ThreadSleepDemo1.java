class MyThread extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Ohh no! I got interrupted.");
        }
    }
}

public class ThreadSleepDemo1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        t.interrupt();
        System.out.println("End of main.");
    }
}
