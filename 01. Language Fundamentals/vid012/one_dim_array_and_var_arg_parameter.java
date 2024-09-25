class one_dim_array_and_var_arg_parameter 
{

    // Var arg parameter can replace the one dimensional array arguement but not vice versa.

    static void m1(int... x)
    {
        int count=0;
        for(int x1:x)
        {
            count++;
        }
        System.out.println("Count :"+count);
    }


    static void m2(int[] x)
    {
        int count=0;
        for(int x1:x)
        {
            count++;
        }
        System.out.println("Count :"+count);
    }
    public static void main(String[] args)
    {
        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30);
        m1(new int[]{});
        m1(new int[]{10});
        m1(new int[]{10,20});
        m1(new int[]{10,20,30});

        // m2();                                                   // CE
        // m2(10);                                               // CE
        // m2(10,20);                                              // CE
        // m2(10,20,30);                                           // CE
        m2(new int[]{});
        m2(new int[]{10});
        m2(new int[]{10,20});
        m2(new int[]{10,20,30});
    }
}
