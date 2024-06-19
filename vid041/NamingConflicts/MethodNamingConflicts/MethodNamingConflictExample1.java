package MethodNamingConflicts;
import vid041.NamingConflicts.MethodNamingConflicts.Left;
import vid041.NamingConflicts.MethodNamingConflicts.Right;

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
}

