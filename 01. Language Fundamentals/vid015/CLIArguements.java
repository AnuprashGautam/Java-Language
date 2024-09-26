public class CLIArguements {
    public static void main(String[] args) 
    {
        // for(int i=0;i<args.length;i++)
        // {
        //     System.out.println("The "+(i+1)+"th value is:"+args[i]);
        // }

        //We can do the same this in the other way too.
        String[] s={"1","2","3","4"};
        args=s;
        int j=1;
        for(String i:args)
        {
            System.out.println("The "+(j++)+"th value is:"+i);
        }

        //CLI arguements are in the form of strings.
        System.out.println(args[0]+args[1]+args[2]+args[3]);
    }
}
