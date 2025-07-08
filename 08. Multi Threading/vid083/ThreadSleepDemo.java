public class ThreadSleepDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Slide -"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted "+e.getMessage());
            }
        }
    }
}
