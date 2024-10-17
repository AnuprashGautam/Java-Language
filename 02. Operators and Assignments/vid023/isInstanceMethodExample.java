import java.lang.Thread;

public class isInstanceMethodExample {
    public static void main(String[] args) throws Exception {
        Thread t= new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t));
    }
}
