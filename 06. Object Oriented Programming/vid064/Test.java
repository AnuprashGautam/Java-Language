public class Test
{
    static int count=0;

    {
        count++;
    }

    Test()
    {
    }

    Test(int i)
    {
    }

    Test(double d)
    {
    }

    public static void main (String[] args)
    {
        Test t1=new Test();
        Test t2=new Test(10);
        Test t3=new Test(10.2);
        
        System.out.println("The total number of objects created: "+count);
    }
}