public class WhileLoopExample1 
{
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Inside the true block.");
        }
        // System.out.println("Outside the true block.");           //CE: Unreachable statement
    }
}
