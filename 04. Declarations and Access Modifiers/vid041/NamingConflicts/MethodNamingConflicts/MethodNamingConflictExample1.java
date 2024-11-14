interface Left {
    void m1();
}

interface Right {
    void m1();
}

public class MethodNamingConflictExample1 implements Left,Right
{
    public void m1(){
        System.out.println("One implementation for the both methods of both interfaces.");
    }

    public static void main(String[] args) {
        Left l=new MethodNamingConflictExample1();

        l.m1();

        Right r=new MethodNamingConflictExample1();

        r.m1();
    }
}

