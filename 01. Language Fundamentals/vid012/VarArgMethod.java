class VarArgMethod 
{
    static void  add(int a)
    {}
    static void  add(int a,int b)
    {}
    static void  add(int... i)                          //least precedence
    {
        int total=0;
        for(int i1:i)
            total+=i1;
        System.out.println("The sum of var arg array is: "+total);
    }

    public static void main(String[] args) {
        add();
        add(10);
        add(10,20);
        add(10,20,30);
    }
}
