import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        // l.add(10);
        // l.add(null);
        System.out.println("Before sorting:---"+l);
        Collections.sort(l);
        System.out.println("After sorting :---"+l);

    }
}
