public class Test1 {
    public static void main(String[] args) {
        Test1 t= new Test1();
        t=null;
        System.gc();
        System.out.println("End of main");
    }

    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}
