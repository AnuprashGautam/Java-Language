public class OuterClass {
    static class StaticNestedInnerClass{
        public void m1() {
            System.out.println("Static nested inner class m1 method");
        }
    }
    
    public static void main(String[] args) {
        StaticNestedInnerClass s=new StaticNestedInnerClass();
        s.m1();
    }
}
