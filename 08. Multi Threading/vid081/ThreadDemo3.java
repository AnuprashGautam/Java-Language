class MyThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++)
        {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.setPriority(10);
        t.start();

        try{
            Thread.sleep(10);               // Sleeping the main thread so that the child thread may get the time to get the priority set by the JVM.
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=0; i<10; i++)
        {
            System.out.println("Main Thread");
        }
    }
}
