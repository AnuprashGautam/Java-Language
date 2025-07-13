public class OuterClass{
    class InnerClass {
    
        static int i=10;
        public static void main(String[] args) {
            System.out.println("Inner class static main method.");
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer class static main method.");
    }
}