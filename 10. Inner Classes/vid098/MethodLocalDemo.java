public class MethodLocalDemo {

    public void m1()
    {
        class MethodLocalClass{
            public void sum(int a, int b)
            {
                System.out.println("The sum: "+(a+b));
            }
        }

        MethodLocalClass m=new MethodLocalClass();
        m.sum(10,20);
        m.sum(1,20);
        m.sum(11,20);
        m.sum(99,20);
    }

    public static void main(String[] args) {
        MethodLocalDemo d=new MethodLocalDemo();
        d.m1();
    }
}