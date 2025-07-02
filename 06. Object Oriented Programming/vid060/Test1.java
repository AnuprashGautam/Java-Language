public class Test1 {
    static{
        System.out.println(i);      // Direct Read
    }

    static int i=10;            

    public static void main(String[] args) {
        System.out.println(i);      // Indirect Read
    }
}
