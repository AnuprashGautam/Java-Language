import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable{
    int num;

    MyCallable(int num)
    {
        this.num=num;
    }

    public Object call() throws Exception{
        System.out.println(Thread.currentThread().getName()+" is responsible to find the sum of first "+num+" numbers.");

        int total=0;

        for(int i=1; i<=num; i++){
            total+=i;
        }

        return total;
    }
}

public class ExecutorDemo1 {
    public static void main(String[] args) {
        MyCallable[] callableJobs={new MyCallable(10),
                                    new MyCallable(20),
                                    new MyCallable(7),
                                    new MyCallable(12),
                                    new MyCallable(4),
                                    new MyCallable(23),
                                    new MyCallable(13),
                                    new MyCallable(45),
                                    new MyCallable(31)};

        ExecutorService service=Executors.newFixedThreadPool(3);

        for(MyCallable job: callableJobs)
        {
            Future f=service.submit(job);
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        service.shutdown();
    }
}
