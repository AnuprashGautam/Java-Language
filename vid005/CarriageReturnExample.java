public class CarriageReturnExample {

    public static void main(String[] args) throws InterruptedException {
        // Simulate a task by updating the progress every second
        for (int i = 0; i <= 100; i += 10) {
            System.out.print("Progress: " + i + "%\r");
            // Flush the output to ensure the carriage return takes effect
            System.out.flush();
            // Simulate some work with a sleep
            Thread.sleep(500);
        }
        // Print a final newline character to move to the next line after the progress completes
        System.out.println("Progress: 100%");
    }
}
