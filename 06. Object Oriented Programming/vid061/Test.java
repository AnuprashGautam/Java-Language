class Base {
    static int i=10;

    static{
        m1();
        System.out.println("Base Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Base Main");
    }

    public static void m1()
    {
        System.out.println(j);
    }

    static int j=20;
}

class Derived extends Base{
    static int x=100;
    static{
        m2();
        System.out.println("Derieved First Static Block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Derieved Main");
    }

    public static void m2()
    {
        System.out.println(y);
    }

    static{
        System.out.println("Derieved Second Static Block");
    }

    static int y=200;
}
