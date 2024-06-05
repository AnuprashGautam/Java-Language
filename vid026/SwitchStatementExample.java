public class SwitchStatementExample
{
    public static void main (String[] args)
    {
        int choice=10;
        final int x=20;
        switch(choice)                                                  // switch arguement and case label can be expression but the case label expression must be constant. Case labels should be in the range of switch arguement datatype.
        {
            // System.out.println("Independent Statement");             //Independent Statements are not allowed.
            case (10):
                System.out.println("Inside Case 1");
                break;
            case x:                                                     //Constant expression are required. Variables are acceptable only if they are final.
                System.out.println("Inside Case 2");  
                break;
        }
    }
}