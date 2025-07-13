public class A 
{
    class B{
        class C
        {
            public void m1()
            {
                System.out.println("This is the inner most class method.");
            }
        }
    }

    public static void main(String[] args) {
        // new A().new B().new C().m1();

        A a=new A();
        A.B b=a.new B();
        A.B.C c=b.new C();

        c.m1();
    }
}
