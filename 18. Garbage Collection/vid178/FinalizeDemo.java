public class FinalizeDemo {
    static FinalizeDemo s;

    public static void main(String[] args) throws InterruptedException{
        FinalizeDemo f = new FinalizeDemo();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of main");
    }

    public void finalize()
    {
        System.out.println("Finalize method called.");
        s=this;
    }
}
