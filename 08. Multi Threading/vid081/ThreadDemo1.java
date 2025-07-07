class MyThread extends Thread {

}

public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Thread t=new Thread();
        System.out.println(t.getPriority());
    }
}
