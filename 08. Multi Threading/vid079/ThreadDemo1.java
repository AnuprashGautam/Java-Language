class MyThread extends Thread
{
    public void run(){
        System.out.println("No arg run method.");
    }

    public void run(int x){
        System.out.println("Int arg run method.");
    }

    public void run(float f){
        System.out.println("Float arg run method.");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

        // 1. Register the thread with thread scheduler
        // 2. Perform other mandatory tasks
        // 3. Call run() method
    }    
}