public class Test {
    public static void main(String[] args) {
        String s = new String("durga");
        s=null;
        System.gc();
        System.out.println("End of main");
    }

    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}
