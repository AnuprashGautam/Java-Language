class Test1 {
    Test1(){
        this(10);
        System.out.println("Hahahaha! I am no arg constructor and triggering the constructor call.");
    }

    Test1(int i){
        this(10.30);
        System.out.println("I was called by that dumb no arg constructor");
    }

    Test1(double d){
        System.out.println("Ahh! I was called by that int arg contstructor.");
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
    }
}
