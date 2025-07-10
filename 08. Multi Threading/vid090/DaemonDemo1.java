class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the daemon thread, and i am not yet terminated.");
        }
    }
}

public class DaemonDemo1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();

        System.out.println("End of the main thread, non-daemon thread.");
    }
}
