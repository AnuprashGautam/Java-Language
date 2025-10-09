public class Test2 {
    public static void main(String[] args) {
        Test2 t= new Test2();
        t.finalize();
        t.finalize();
        t=null;
        System.gc();
        System.out.println("End of main");
    }

    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}
