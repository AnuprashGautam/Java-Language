class MyThread extends Thread{
    static Thread mt;
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {
            System.out.println("This thread got interrrupted "+e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.mt=Thread.currentThread();
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted "+e.getMessage());
            }
        }
    }
}
