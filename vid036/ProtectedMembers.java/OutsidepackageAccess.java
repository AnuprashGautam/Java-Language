import package1.A;

class OutsidePackageAccess extends A
{
    public static void main(String[] args) 
    {
        A a=new A();   //Parent Reference not allowed
        a.m1();

        OutsidePackageAccess b=new OutsidePackageAccess();    //Child Reference is allowed
        b.m1();

        A c=new OutsidePackageAccess();    //Parent Reference not allowed
        c.m1();
    }
}
