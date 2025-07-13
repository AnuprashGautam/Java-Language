interface OuterInterface {
    public void m1();

    interface InnerInterface{
        public void m2();
    }
}

class Test1 implements OuterInterface{
    public void m1()
    {
        System.out.println("Outer interface method implementation.");
    }
}

class Test2 implements OuterInterface.InnerInterface{
    public void m2()
    {
        System.out.println("Inner interface method implementation.");
    }
}

public class Test {

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.m1();

        Test2 t2=new Test2();
        t2.m2();
    }
}