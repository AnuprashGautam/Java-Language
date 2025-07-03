class Test2 {
    Test2(){
        this(10);
    }

    Test2(int i) {
        this();
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        System.out.println("Hello");
    }
}
