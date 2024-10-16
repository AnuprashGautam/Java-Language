public class ConcatenationOperator
{
    public static void main (String[] args)
    {
        String a="hello";
        int b=10, c=20,d=30;
        System.out.println(a+b+c+d);
        System.out.println(b+c+d+a);
        System.out.println(b+c+a+d);
        System.out.println(b+a+c+d);
    }
}