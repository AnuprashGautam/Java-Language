public class StrictfpMemberExample {
    strictfp public void m1() {
        System.out.println(10.0 / 3);
    }

    public static void main(String[] args) {
        // It is used for the classes and methods.
        // strict-abstract combination for methods is illegal.
        System.out.println("StrictFP modifier for the methods.");

        // Create an instance and call m1
        StrictfpMemberExample example = new StrictfpMemberExample();
        example.m1();
    }
}
