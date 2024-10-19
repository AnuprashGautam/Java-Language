import java.util.*;
import java.sql.*;


public class AmbiguityExample
{
    public static void main (String[] args)
    {
        // Date d=new Date();             //Will give the compile time error.So use fully qualified name.
        java.util.Date d=new java.util.Date();
        System.out.println(d.getClass().getName());


        //Same situation acn be observed in the case of "List" class which is present in two packages: util , awt.

        /*Precedence:
        1. Explicit type import
        2. Current working directory present class
        3. Implicit type import
        */

    }
}