public class ArrayExample {
    public static void main(String[] args) {
        // for(int i=0;i<=args.length;i++)
        // {
        // System.out.println(args[i]);
        // }

        String[] argh =new String[] { "A", "AA", "AAA" };
        args = argh;
        for (String s : args) {
            System.out.println(s);
        }
    }
}
