public class IncrementDecrementOperators 
{
    public static void main(String[] args) 
    {
        //Incerement and decrement operators can be applied on every primitive datatypes except boolean.
        int a=10;
        int b=++a;
        // int c=++10;       //CE. Can't apply the inc dec operator on the constant.
        final int d= 20;
        // d++;                 //CE. Can't assign value to the final variable.
        char ch='a';
        ch++;
        System.out.println(ch);
        boolean x=true;
        // x++;                //CE. Operator ++ can not applied to boolean.
        System.out.println(x);
    }
}
