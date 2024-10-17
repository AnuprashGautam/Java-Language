public class DoWhileLoopExample3 {
    public static void main(String[] args) {
        do
            while(true)
                System.out.println("Hello");
        while(false);
        // System.out.println("Outside Do While");             //CE:Unreachable statement        
    }
}
