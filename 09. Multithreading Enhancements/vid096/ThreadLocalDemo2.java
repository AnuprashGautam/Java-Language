class CustomerThread extends Thread{
    static int custID=0;

    private ThreadLocal tl=new ThreadLocal<>(){
        protected String initialValue(){
            return "Cust"+ ++custID;
        }
    };

    CustomerThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" --- this customer has the customer id : "+tl.get());
    }
}

public class ThreadLocalDemo2 {

    public static void main(String[] args) {
        CustomerThread t1=new CustomerThread("First Customer");
        CustomerThread t2=new CustomerThread("Second Customer");
        CustomerThread t3=new CustomerThread("Third Customer");
        CustomerThread t4=new CustomerThread("Fourth Customer");
        CustomerThread t5=new CustomerThread("Fifth Customer");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}