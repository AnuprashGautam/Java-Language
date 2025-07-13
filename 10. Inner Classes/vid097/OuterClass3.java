class OuterClass3{
    class InnerClass{
        public void m1()
        {
            System.out.println("Inner class m1 method.");
        }
    }
}

class Test {

    public static void main(String[] args) {
        OuterClass3 o=new OuterClass3();
        OuterClass3.InnerClass i=o.new InnerClass();
        i.m1();
    }
}