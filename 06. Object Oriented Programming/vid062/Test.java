public class Test {
    int i=10;
    {
        m1();
        System.out.println("First Instance Block");
    }
    Test(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println("main");
    }

    public void m1(){
        System.out.println(j);
    }

    {
        System.out.println("Second Instance Block");
    }

    int j=20;
}
