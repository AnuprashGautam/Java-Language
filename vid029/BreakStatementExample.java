public class BreakStatementExample {
    public static void main(String[] args) {
        //break statement is only used in loop, switch statement and labeled blocks. Using it anywhere else will give CE.
        
        int x=10;

        l1:
        {
            System.out.println("Start");
            if(x==10)
                break l1;
            System.out.println("End");
        }
        System.out.println("Outside the labeled block.");
    }
    
}
