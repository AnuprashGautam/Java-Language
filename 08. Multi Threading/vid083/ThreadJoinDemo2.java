public class ThreadJoinDemo2 {
    public static void main(String [] args)
    {
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread ");
        }
    }
}
