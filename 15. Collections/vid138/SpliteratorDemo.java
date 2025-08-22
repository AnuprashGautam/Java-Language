import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args)
    {
        List<String> names=new ArrayList<String>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        Spliterator spliterator=names.spliterator();

        Spliterator splitSpliterator=spliterator.trySplit();

        if(splitSpliterator!=null)
        {
            System.out.println("Processing elements in splitSpliterator:---");
            splitSpliterator.forEachRemaining(System.out::println);
        }

        System.out.println("Processing elements remaining in spliterator:---");
        spliterator.forEachRemaining(System.out::println);
    }
}
