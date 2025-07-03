public class Test2
{
    Test2(){
        System.out.println("I am a constructor, not a method.");
    }
    void Test2(){
        System.out.println("I am method, not a constructor.");
    }
    public static void main (String[] args)
    {
        Test2 t=new Test2();
        t.Test2();
    }
}