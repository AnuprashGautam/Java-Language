public class ThreadA {
    public static void main(String[] args) throws InterruptedException{
        ThreadB b=new ThreadB();
        b.start();

        synchronized(b)
        {
            System.out.println("Main thread is starting...");
            b.wait();
            System.out.println("Main thread got notification.");
            System.out.println("The updated value of total is: "+b.total);
        }
    }
}

class ThreadB extends Thread{
    int total=1;

    public void run(){
        synchronized(this)
        {
            System.out.println("The child thread is starting doing calculation...");
            for (int i = 0; i < 10; i++) {
                total+=i;
            }
            System.out.println("The calculation got completed. And, calling notify mehtod...");
            this.notify();
        }
    }
}
