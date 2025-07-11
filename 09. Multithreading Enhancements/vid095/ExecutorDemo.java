import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;

    PrintJob(String name)
    {
        this.name=name;
    }

    public void run()
    {
        System.out.println(name+" --- job is started by the "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println(name+" --- job is completed by the "+Thread.currentThread().getName());
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(3);

        PrintJob[] jobs={new PrintJob("Dhruv"),
                         new PrintJob("Ravi"),
                         new PrintJob("Suresh"),
                         new PrintJob("Ram"),
                         new PrintJob("Shyam"),
                         new PrintJob("Rinku"),
                         new PrintJob("Dhanshyam"),
                         new PrintJob("Ramu")};
        
        for(PrintJob job: jobs)
        {
            service.submit(job);
        }

        service.shutdown();
    }
}
