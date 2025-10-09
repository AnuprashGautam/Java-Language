enum Beer{
    KF, KO, RC, FO;

    Beer()
    {
        System.out.println("Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Beer b=Beer.RC;
        System.out.println("Hello");
    }
}
