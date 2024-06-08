
class Parent
{
    public void property()                                    //Overridden method
    {
        System.out.println("Gold");
    }
    public final void marry()                                 //Overridden Method. If this method get "final" then child class won't be able to override it.
    {
        System.out.println("Subhalakshmi");
    }
}



public class Child extends Parent
{
    public void property()                                 //Overridding Method
    {
        System.out.println("Uravashi");
    }

    public static void main(String[] args) {
        System.out.println("Child extending the parent class.");
    }
}
