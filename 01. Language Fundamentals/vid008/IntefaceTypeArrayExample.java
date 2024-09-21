import java.rmi.server.SocketSecurityException;

public class IntefaceTypeArrayExample {
    public static void main(String[] args) {
        // We can't create interface objects, but can create the interface arrays.
        // Only it can contain those class objects which implement the intereface.

        Runnable[] r=new Runnable[10];
        r[0]=new Thread();       // Implements the Runnable
        System.out.println(r[0]);
        // r[1]=new String("Anuprash");    //CE. Beacause String does not implement the runnable interface.
    }
}
