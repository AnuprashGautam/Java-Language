import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortDemo1 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");

        System.out.println("Before sorting:---"+l);
        Collections.sort(l, new MyComparator());
        System.out.println("After sorting :---"+l);

    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1=String.valueOf(obj1);
        String s2=String.valueOf(obj2);

        return s2.compareTo(s1);
    }
}
