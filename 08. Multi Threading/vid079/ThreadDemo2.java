class MyThread extends Thread
{
    public void run(){
        System.out.println("Run Method");
    }

    public void start(){
        super.start();
        System.out.println("Start Method");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        System.out.println("Main Method");
    }    
}