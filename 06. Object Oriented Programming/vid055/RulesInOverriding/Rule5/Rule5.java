// Final methods of the parent class can't be overriden in the child class. If we try then we will get Compiletime Erorr.


class Parent
{
    final void m1()
    {
        System.out.println("Parent class private method");
    }
}

class Child extends Parent
{
    public void m1()       // It is final method. We can not override it.
    {}
}


