public class MethodLocalDemo2 {

    public static void m1()
    {
        int  x=10;
        class MethodLocalClass{
            public void m2()
            {
                x=60;   // local variables referenced from an inner class must be final or effectively final
                System.out.println("Local varible of method m1:"+x);
            }
        }

        MethodLocalClass m=new MethodLocalClass();
        m.m2();
    }

    public static void main(String[] args) {
        MethodLocalDemo2 d=new MethodLocalDemo2();
        d.m1();
    }
}