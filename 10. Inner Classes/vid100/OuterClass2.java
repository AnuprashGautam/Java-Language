public class OuterClass2 {
    int x=10;
    static int y=20;

    static class StaticNestedInnerClass{
        public void m1() {
            System.out.println(x);
            System.out.println(y);
        }
    }
    
    public static void main(String[] args) {
        StaticNestedInnerClass s=new StaticNestedInnerClass();
        s.m1();
    }
}
