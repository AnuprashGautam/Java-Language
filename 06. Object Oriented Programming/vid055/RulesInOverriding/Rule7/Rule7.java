class PastClass
{
    public void toolkit()
    {
        System.out.println("Old toolkit was being used.");
    }
}

abstract class PresentClass extends PastClass
{
    abstract public void toolkit();
}

class FutureClass extends PastClass
{
    public void toolkit()
    {
        System.out.println("New toolkit will be used.");
    }
}

public class Rule7
{
    public static void main(String[] args) {
        PastClass p1=new PastClass();
        p1.toolkit();

        // PastClass p2=new PresentClass();                  //PresentClass is abstract; cannot be instantiated
        // p2.toolkit();

        PastClass p3=new FutureClass();
        p3.toolkit();
    }
}