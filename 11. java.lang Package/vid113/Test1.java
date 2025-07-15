public class Test1 {

    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(t==null);
        System.out.println(t.equals(null));
    }
}