public class Inteface_type_arrays {
    public static void main(String[] args) {
        // We can't create interface objects, but can create the interface arrays.
        // Only it can contain those class objects which implement the intereface.

        Runnable[] r=new Runnable[10];
        r[0]=new Thread();       // Implements the Runnable
        // r[1]=new String("Anuprash");    //CE. Beacause String does not implement the runnable interface.
    }
}
