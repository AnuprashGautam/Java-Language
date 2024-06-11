public class FinalStaticVariableExample1 
{
    static int x;                          //JVM will provide the default initialisation for static variables. 
    // final static int y;                 //For final static instance variable we will have to provide the initialisation whether we are using it or not.

    public static void main(String[] args) 
    {
        System.out.println(x);
    }
}
