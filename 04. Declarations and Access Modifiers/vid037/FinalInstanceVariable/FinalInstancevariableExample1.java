public class FinalInstancevariableExample1
{
    int x;                          //JVM will provide the default initialisation for instance variables.
    // final int y;                 //For final instance variable we will have to provide the initialisation whether we are using it or not.
    public static void main (String[] args)
    {
        FinalInstancevariableExample1 obj=new FinalInstancevariableExample1();
        System.out.println(obj.x);
    }
}