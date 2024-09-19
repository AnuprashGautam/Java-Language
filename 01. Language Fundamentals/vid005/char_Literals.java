public class char_Literals
{
    public static void main (String[] args)
    {
        char c1='a';
        // char c2="a";
        // char c3='abcd';
        // char c4=a;
        // char c5=null;


        //We can specify char literal as the integer (in either form bin,dec,hex,oct but the range should be 0 - 65535)
        
        char  c6=4;
        char  c7=01234;
        char  c8=0x1234;
        char  c9='\u0004';
        char c10='\t';

        System.out.println("Char Literal: "+c8);
        System.out.println("Char Literal: "+c9);
        System.out.println("Char Literal: "+c10);
    }
}