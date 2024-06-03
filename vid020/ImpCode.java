public class ImpCode 
{
    public static void main(String[] args) 
    {
        int x=10;
        if(++x<10 && x/0>10)
        {
            System.out.println("Code is running fine.");
        }
        else
        {
            System.out.println("Code is not running fine.");
        }
    }

    //If we replace && with & then we will get the runtime exception.
}
