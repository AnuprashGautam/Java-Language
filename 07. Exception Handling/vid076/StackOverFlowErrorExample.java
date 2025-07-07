public class StackOverFlowErrorExample {
    static void m1(){
        m2();
    }
    static void m2(){
        m1();
    }
    public static void main(String[] args) {
        StackOverFlowErrorExample.m1();
    }
}
