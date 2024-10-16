public class ImportantCode
{
    // Difference between b++ and b=b+1
    public static void main (String[] args)
    {
        byte b=10;
        // b=b+1;                      // Will give the compile time error as (b+1) will be in int type and we can't assign int value to byte implicitly.

        b=(byte)(b+1);                 // b=(byte)(b+1) is equal to b++.
        //or
        //b++;                         //Implicit typecasting is present in b++.
        //or
        //b+=1;                         //Implicit typecasting is present in b+=1.
        System.out.println(b);
    }
}
