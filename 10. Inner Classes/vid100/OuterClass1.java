public class OuterClass1 {
    class StaticNestedInnerClass{
        public static void main(String[] args) {
            System.out.println("Static nested class main method");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Outer class main method");
    }
}
