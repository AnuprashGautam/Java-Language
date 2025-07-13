public class MethodLocalDemo1 {
    int x=10;
    static int y=20;

    public static void m1()
    {
        class MethodLocalClass{
            public void m2()
            {
                System.out.println("Instance varible of outer class:"+x);
                System.out.println("Static varible of outer class:"+y);
            }
        }

        MethodLocalClass m=new MethodLocalClass();
        m.m2();
    }

    public static void main(String[] args) {
        MethodLocalDemo1 d=new MethodLocalDemo1();
        d.m1();
    }
}