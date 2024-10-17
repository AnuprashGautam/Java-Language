public class WhileLoopExample2
{
    public static void main(String[] args) {
        int x=10;
        int y=20;
        while(x<y)
        {
            System.out.println("Inside the true block.");
        }
        System.out.println("Outside the true block.");           //Will not get the CE.
    }
}
