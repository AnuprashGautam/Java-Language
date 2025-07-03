class Test1 {
    public static void m1(){
        m2(10);
    }

    public static void m2(int i) {
        m1();
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Hello");
    }
}
