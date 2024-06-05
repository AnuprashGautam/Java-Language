public class FallThroughSwitch 
{
    public static void main(String[] args)
    {
        int x=10;
        switch (x)              //Default case can be defined anywhere inside the switch statement. It is recommended to use break with case labels and default case so that they behave as expected.
        {
            case 10:
                System.out.println(10);
                break;

            case 20:
                System.out.println(20);
                break;

            default:
                System.out.println("Default Case");
                break;

            case 30:
                System.out.println(30);
                break;
        }
    }
}
