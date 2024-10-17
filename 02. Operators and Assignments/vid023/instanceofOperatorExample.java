public class instanceofOperatorExample {
    public static void main(String[] args) {
        Thread t= new Thread();

        System.out.println(t instanceof Object);
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);
        // System.out.println(t instanceof String);   //CE because we cannot compare the objects which doesn't have any relationship.
    }
}
