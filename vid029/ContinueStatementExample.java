public class ContinueStatementExample {
    public static void main(String[] args) {
        // Only used in loops.
        for (int i = 0; i < 11; i++) {
            if(i%2==0)
                continue;
            System.out.println(i);
        }
    }
}
