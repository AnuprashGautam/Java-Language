public class main_method_overloading {
    //JVM will run the main method with this parameter: String[] args
    public static void main(String[] args) {
        System.out.println("String[] method");
    }
    public static void main(int[] x) {
        System.out.println("int[] method");
    }
    public static void main(Boolean[] b) {
        System.out.println("Boolean[] method");
    }
}
