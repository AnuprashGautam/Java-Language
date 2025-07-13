public class OuterClass {
    int x=10;
    static int y=20;

    class InnerClass{
        public void m1()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        new OuterClass().new InnerClass().m1();
    }
}
