import static java.lang.Math.sqrt;
import static java.lang.Math.*;

// There are two types of elements in the file: static and non static. Normal import statement is used for static elements, but for static elements we have to use the static import. 

public class StaticImportExample 
{
    //Usually we import static import with the help of class name, but with the help of static import we can directly use the method after statically importing the method.

    public static void main(String[] args) {


        // System.out.println(Math.sqrt(4));
        // System.out.println(Math.max(10,20));
        // System.out.println(Math.random());

        System.out.println(sqrt(4));
        System.out.println(max(10,20));
        System.out.println(random());

    }
}
