public class IfElseStatement
 {
    public static void main(String[] args) 
    {
        //Arguement of if must be boolean type.
        boolean b=true;
        if(b=false)
        {
            System.out.println("If block");
        }
        else
        {
            System.out.println("Else block");
        }
        System.out.println(b);
    }
}
