class Display{
    public void wish(String name){
        ;;;;;;;;;;;;;;; // 1 Lakh lines of code
        synchronized(Display.class){
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Moring :");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
        ;;;;;;;;;;;;;;; // 1 Lakh lines of code
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        d.wish(name);
    }
}

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Display d1=new Display();
        Display d2=new Display();

        MyThread t1=new MyThread(d1, "Dhoni");
        MyThread t2=new MyThread(d2, "Yuvraj");

        t1.start();
        t2.start();
    }
}
