public class var_args 
{
    public void num_sum_multiply(int mul,int ... x)
    {
        int total=0;
        for(int i:x)
        {
            total+=i;
        }
        System.out.println("The no of args :"+x.length);
        System.out.println("The sum of the numbers is :"+total);
        System.out.println("The sum of the numbers after multiply is :"+total*mul);
    }

    // public void num_sum_multiply(int mul,int[] x)                              //will give the compile time errror
    // {
    //     System.out.println("Other method with 1 dimen array");
    // }

    public void num_sum_multiply(int x)
    {
        System.out.println("The num is :"+x);
    }

    public static void main(String[] args) {
        var_args obj=new var_args();
        obj.num_sum_multiply(2);                                         //General method will win.
        obj.num_sum_multiply(2,1,2,3,4);
    }
}
