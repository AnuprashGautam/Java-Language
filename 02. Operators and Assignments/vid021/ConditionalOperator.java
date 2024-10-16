public class ConditionalOperator 
{
    //Only ternary operator in jave.
    public static void main(String[] args) 
    {
        int age=Integer.parseInt(args[0]);
        int permission=(age>=18)?1:0;

        if(permission==1)
        {
            System.out.println("You are allowed to vote.");
        }
        else
        {
            System.out.println("You are not allowed to vote.");
        }
    }
}
