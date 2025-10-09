class A {

    public void finalize()
    {
        System.out.println("Class A finalize method called.");
    }
}

class B {

    public void finalize()
    {
        System.out.println("Class B finalize method called.");
    }
}

public class FinalizeDemo1 {
    public static void main(String[] args) throws InterruptedException{
        A a= new A();
        a=null;
        Runtime.getRuntime().gc();
        
        Thread.sleep(5000);

        A a1=new A();
        a1=null;
        Runtime.getRuntime().gc();

        Thread.sleep(5000);

        B b=new B();
        b=null;
        Runtime.getRuntime().gc();
    }
}
