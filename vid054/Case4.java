public class Case4 {
    public void m1(int i, float f)
    {
        System.out.println("Int-FLoat Version");
    }

    public void m1(float f, int i)
    {
        System.out.println("Float-Int Version");
    }

    public static void main(String[] args) {
        Case4 c=new Case4();
        c.m1(1,2.3f);
        c.m1(3.4f,5);
        // c.m1(10,10);                          //CE: referenece to m1() os ambiguous.
        // c.m1(10.5f,10.5f);                    //CE: Can't find symbol 
    }
}
