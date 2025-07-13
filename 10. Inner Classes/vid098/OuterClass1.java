public class OuterClass1 {
    int x=10;

    class InnerClass{
        int x=100;
        public void m1()
        {
            int x=1000;
            System.out.println(x);

            System.out.println("---------------------------------");

            System.out.println(this.x);
            System.out.println(InnerClass.this.x);

            System.out.println("---------------------------------");

            System.out.println(OuterClass1.this.x);
        }
    }

    public static void main(String[] args) {
        new OuterClass1().new InnerClass().m1();
    }
}
