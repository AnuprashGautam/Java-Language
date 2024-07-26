public class Case3 
{
    public void m1(String s)
    {
        System.out.println("String Version");
    }

    public void m1(StringBuffer sb)
    {
        System.out.println("StringBuffer Version");
    }

    public static void main(String[] args) {
        Case3 c=new Case3();
        c.m1("Ram");
        c.m1(new StringBuffer("Ram"));
        // c.m1(null);                            //CE: referenece to m1() is ambiguous.
        c.m1(new String("Ram"));
    }
}
