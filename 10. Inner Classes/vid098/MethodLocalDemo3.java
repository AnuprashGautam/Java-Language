public class MethodLocalDemo3 {
    int i=10;
    static int j=20;

    public void m1()
    {
        int  k=30;
        final int m=40;

        class MethodLocalClass{
            public void m2()
            {
                System.out.println("Instance variable of outer class:"+i);                                           
                System.out.println("Static variable of outer class:"+j);
                System.out.println("Local varible of method m1:"+k);
                System.out.println("Final local varible of method m1:"+m);
            }
        }

        MethodLocalClass m1=new MethodLocalClass();
        m1.m2();
    }

    public static void main(String[] args) {
        MethodLocalDemo3 d=new MethodLocalDemo3();
        d.m1();
    }
}