import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortDemo1 {
    public static void main(String[] args) {
        int[] a ={10, 5, 20, 11, 6};

        Arrays.sort(a);

        System.out.println(Arrays.binarySearch(a, 6));
        System.out.println(Arrays.binarySearch(a, 14));


        String[] s={"A","Z","B"};

        Arrays.sort(s);
    
        System.out.println(Arrays.binarySearch(s,"Z"));
        System.out.println(Arrays.binarySearch(s,"S"));

        Arrays.sort(s, new MyComparator());

        System.out.println(Arrays.binarySearch(s,"Z", new MyComparator()));
        System.out.println(Arrays.binarySearch(s,"S", new MyComparator()));
        System.out.println(Arrays.binarySearch(s,"S", new MyComparator()));
    }
}

class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2)
    {
        String s1=String.valueOf(obj1);
        String s2=String.valueOf(obj2);

        return s2.compareTo(s1);
    }
}
