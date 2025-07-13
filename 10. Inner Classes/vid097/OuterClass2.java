class OuterClass2{
    class InnerClass{
        public void m1()
        {
            System.out.println("Inner class m1 method.");
        }
    }

    public void m2()
    {
        InnerClass i=new InnerClass();
        i.m1();
    }

    public static void main(String[] args) {
        OuterClass2 o=new OuterClass2();
        o.m2();
    }
}