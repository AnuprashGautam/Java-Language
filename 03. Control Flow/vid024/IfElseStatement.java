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

//This code is working properly because after asiging the false value to the variable b, the if statement is considering the assigned value of the variable b as condition.