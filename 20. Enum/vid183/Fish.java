enum Fish{
    STAR, GUPPY, GOLD;

    int x=1000;

    public void m1()
    {
        System.out.println("Enum instance method");
    }

    public static void main(String[] args) {
        Fish f=Fish.GOLD;
        System.out.println("Calling Fish enum instance method:---");
        f.m1();

        System.out.println("Accessing Fish enum instance variable:---");
        System.out.println(f.x);

        System.out.println("Enum main method.");
    }
}
