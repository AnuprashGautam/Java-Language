interface Left {
    int x=777;
}

interface Right {
    int x=888;
}

public class VariableNamingConflictExample1 implements Left, Right
{
    public static void main(String[] args) {
        // System.out.println(x);                   //Ambiguity
        System.out.println(Left.x);
        System.out.println(Right.x);

    }
}
