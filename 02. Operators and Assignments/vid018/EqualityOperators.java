public class EqualityOperators {
    public static void main(String[] args) 
    {
        //Can be applied to any primitve datatype including boolean. It can also be implemented to object types.
        System.out.println("abc"=="abcd");
        System.out.println('a'==97.0);
        System.out.println(true==false);
        System.out.println(true!=false);


        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=t1;
        System.out.println(t1==t3);
        System.out.println(t1==t2);

        //There should be child-parent, parent-child, or same type relation.
        Thread t=new Thread();
        String s=new String("durga");
        Object o=new Object();
        System.out.println(o==t);
        System.out.println(s==o);
        System.out.println(o==o);
        // System.out.println(s==t);                                       //Will give the compile time error.

    }
}
