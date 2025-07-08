class MyThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++)
        {
            System.out.println("Seetha Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted: "+e.getMessage());
            }
        }
    }
}

public class ThreadJoinDemo {

    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted "+e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}