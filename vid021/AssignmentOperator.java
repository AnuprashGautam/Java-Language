public class AssignmentOperator 
{
    public static void main(String[] args) {
        // It is of three types: simple, chained, compound

        //Simple Assignment
        int x=10;

        //Chained Assignment
        // int a=b=c=d=10;                       //Will give the compile time error. Because we can't initialise variables at the time of declaration. We will have to declare the variables and then we can assign them through chain method.

        int b,c,d;
        int a=b=c=d=10;
        System.out.println(a+"..."+b+"..."+c+"..."+d);

        //Compound Assignment
        //Automatic implicit typecasting is there.
        int x1=5;
        x1 >>=1;
        System.out.println(x1);
        x1 <<=1;
        System.out.println(x1);



    }
    
}
