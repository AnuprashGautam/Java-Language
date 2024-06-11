public class FinalInstanceVariableExample2 
{
    final int x;            //we must have to provide the initialization of the final instance variable before the COMPLETION OF CONSTRUCTION.

    // final int x=10;              //First way

    {
        // x=20;                       //Second way
    }

    FinalInstanceVariableExample2()
    {
        x=30;                           //Third way
    }
    public static void main(String[] args) 
    {
        FinalInstanceVariableExample2 obj=new FinalInstanceVariableExample2();
        System.out.println(obj.x);
    }
}
