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

}


// If there is a case in which the methods of two cases have the disimilarity of onlu return type, then it is immpossible to provide the implementations to them with a same class.
