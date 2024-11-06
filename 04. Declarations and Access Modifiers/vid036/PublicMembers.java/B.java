package b_pack;

import a_pack.A;

class B 
{
    public static void main(String[] args) 
    {
        A obj=new A();
        A.m1();                 // CompileTimeError: error: A is not public in a_pack; cannot be accessed   from outside package
    }
}
