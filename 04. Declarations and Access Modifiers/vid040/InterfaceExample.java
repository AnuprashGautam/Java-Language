interface interf 
{
    void m1();
    void m2();
}

abstract class subClass implements interf{
    public void m1(){
        System.out.println("I am method m1 implemented by the class subClass.");
    }
}


public class InterfaceExample extends subClass  {

    public void m2(){
        System.out.println("I am method m2 implemented by the class InterfaceExample.");
    }

    
    public static void main(String[] args) {
        interf i=new InterfaceExample();

        i.m1();
        i.m2();
    }
}
