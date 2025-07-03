class Test {
    Test()
    {
        this(10);
        System.out.println("No Arg");
    }

    Test(int i){
        this(10.5);
        System.out.println("Int Arg");
    }

    Test(double d)
    {
        System.out.println("Double Arg");
    }

    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test(10);
        Test t3=new Test(10.3);
        Test t4=new Test(50l);
    }
}
