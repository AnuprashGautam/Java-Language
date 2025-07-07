class MyThread extends Thread
{
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MyThread t=new MyThread();

        System.out.println(t.getName());
        t.setName("Anuprash");
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
    }
}