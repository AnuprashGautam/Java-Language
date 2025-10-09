public class Test {
    Test i;

    public static void main(String[] args)
    {
        Test t1= new Test();
        Test t2= new Test();
        Test t3= new Test();

        t1.i=t2;
        t2.i=t3;
        t3.i=t1;

        t1=null;
        t2=null;
        t3=null;
    }
}
