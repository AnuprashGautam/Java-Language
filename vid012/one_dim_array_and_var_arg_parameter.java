public class one_dim_array_and_var_arg_parameter 
{
    public static void main(String[] args)
    {
        int [] x={10,20,30};
        int [] y={40,50,60};
        m1(x,y);
    }
    public static void m1(int[] ...x)
    {
        for(int[] x1:x)
        {
            System.out.println(x1[0]);
        }
    }
}
