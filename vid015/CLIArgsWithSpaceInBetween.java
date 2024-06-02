public class CLIArgsWithSpaceInBetween {
    public static void main(String[] args) 
    {
        System.out.println("My friend's names are");
        for(String s:args)
        {
            System.out.println(s);
        }
    }
}
