package package1;

public class A
{
    protected void m1()
    {
        System.out.println("Protected: the most misunderstood modifier in java.");
    }
}

class InsidePackageAccess extends A
{
    public static void main(String[] args) {
        A a=new A();   //Parent Reference
        a.m1();

        InsidePackageAccess b=new InsidePackageAccess();    //Child Reference
        b.m1();

        A c=new InsidePackageAccess();    //Parent Reference
        c.m1();
    }
}
