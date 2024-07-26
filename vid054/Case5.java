// Var-arg method has the least priority.

public class Case5 {
    public void m1(int x)
    {
        System.out.println("General Method");
    }
    public void m1(int... x)
    {
        System.out.println("Var-arg Method");
    }

    public static void main(String[] args) {
        Case5 c=new Case5();
        c.m1();
        c.m1(10);
        c.m1(10,20);
    }
}
