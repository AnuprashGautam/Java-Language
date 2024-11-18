// * Automatic Prmototion in Overloading: If the exact arguemnet method is not find, then first the arguement is promoted to the next level and then it is checked again. This process is keep going on. And if in the last method is not found. The compiler gives Compiletime Error. */


public class Case1
{
    public void m1(int i)
    {
        System.out.println("int args");
    }

    public void m1(float f)
    {
        System.out.println("float args");
    }
    public static void main (String[] args)
    {
        Case1 c=new Case1();
        c.m1('a');
        c.m1(4);
        c.m1(4l);
        c.m1(45.78f);
        // c.m1(45.78);

    }
}
