public class InstanceofOperator {
    public static void main(String[] args) {
        //To use it there should be some relation between the object referenece and class/interface name. Otherwise it will give the compile time error.
        Thread t=new Thread();
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);

        // System.out.println(t instanceof String);         //Compile time error.


        //For any class/interface "X", null instanceof X is false.
        System.out.println(null instanceof Object);
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Runnable);
    }
}
