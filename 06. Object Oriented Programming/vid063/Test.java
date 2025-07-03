import java.lang.reflect.Constructor;

class Test {
    {
        System.out.println("First Instance Block");
    }

    static{
        System.out.println("First Static Block");
    }

    Test(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println("main");
        Test t2=new Test();
    }

    static{
        System.out.println("Second Static Block");
    }

    {
        System.out.println("Second Instance Block");
    }
}


class Initialization1{
    private static String m1(String msg){
        System.out.println(msg);
        return msg;
    }

    public Initialization1(){
        m=m1("1");
    }

    {
        m=m1("2");
    }

    String m=m1("3");
    public static void main(String[] args) {
        Object o=new Initialization1();
    }
}

class Initialization2{
    public static String m1(String msg) {
        System.out.println(msg);
        return msg;
    }

    static String m=m1("1");
    {
        m=m1("2");
    }

    static{
        m=m1("3");
    }

    public static void main(String[] args) {
        Object obj=new Initialization2();
    }
}
