interface Left {
    void m1();
}

interface Right {
    void m1(int i);
}

public class MethodNamingConflictExample2 implements Left, Right
{
    // These are overloaded methods.

    public void m1()
    {
        System.out.println("Implementation for the Left interface method.");
    }

    public void m1(int i)
    {
        System.out.println("Implementation for the Right interface method:"+i);
    }

    public static void main(String[] args) {
        Left l=new MethodNamingConflictExample2();
        l.m1();

        Right r=new MethodNamingConflictExample2();
        r.m1(10);
    }

}


// If there is a case in which the methods of two cases have the disimilarity of only return type, then it is immpossible to provide the implementations to them with a same class.
