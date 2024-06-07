import static java.lang.Integer.*;
import static java.lang.Byte.*;

//In normal import statement,"*" is allowed after the package name.
//In static import statement,"*" is allowed after the class name.


public class StaticImportExample 
{
    public static void main(String[] args) {

        System.out.println(MAX_VALUE);                         // Will the compiletime error.


        // System.out.println(Integer.MAX_VALUE);              //Output: 2147483647
        // System.out.println(Byte.MAX_VALUE);                 //127


    }
}
