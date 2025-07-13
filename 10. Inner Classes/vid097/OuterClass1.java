class OuterClass1{
    class InnerClass{
        public void m1()
        {
            System.out.println("Inner class m1 method.");
        }
    }

    public static void main(String[] args) {
        // OuterClass1 o=new OuterClass1();
        // OuterClass1.InnerClass i=o.new InnerClass();
        // i.m1();

        // OuterClass1.InnerClass i=new.OuterClass1().new InnerClass();
        // i.m1();

        new OuterClass1().new InnerClass().m1();
    }
}