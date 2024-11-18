// Private methods of the parent class is not available to the child class. So we can not override them. 


class Parent
{
    private void m1()
    {
        System.out.println("Parent class private method");
    }
}

class Child extends Parent
{
    private void m1()       // It is not overriding. We are just implementing another m1() private method for the child class.
    {
        System.out.println("Child class private method");
    }
}

