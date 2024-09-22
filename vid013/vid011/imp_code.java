public class imp_code {
    public static void main(String[] args) {
        //only modifier applicale for the local variable is final.
        int x=8;
        if (args.length>0)
        {
            x=10;
        }
        else
        {
            x=20;
        }
        System.out.println(x);
    }
}
