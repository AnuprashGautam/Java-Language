public class WhileLoopExample3
{
    public static void main(String[] args) {
        final int x=10;
        final int y=20;
        while(x<y)
        {
            System.out.println("Inside the true block.");
        }
        System.out.println("Outside the true block.");           //Will get the CE saying unreachable statement.
    }
}
