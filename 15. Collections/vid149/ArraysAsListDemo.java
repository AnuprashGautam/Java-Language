import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        String[] s={"A","Z","B"};
        List l=Arrays.asList(s);

        System.out.println(l);

        s[0]="K";

        System.out.println(l);

        l.set(1, "L");

        for(String s1: s)
        {
            System.out.print(s1+" ");
        }System.out.println();

        // l.add("Gautam");
        // l.remove(2);
        l.set(1, 10);
    }
}
