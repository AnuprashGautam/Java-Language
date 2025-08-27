import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] a ={10, 5, 20, 11, 6};

        System.out.println("Primitive Array Before Sorting:---");
        for(int a1:a)
        {
            System.out.print((a1+" "));
        }System.out.println();

        Arrays.sort(a);

        System.out.println("Primitive Array After Sorting:---");

        for(int a1: a)
        {
            System.out.print(a1+" ");
        }System.out.println();

        String[] s={"A","Z","B"};

        System.out.println("Object Array Before Sorting:---");

        for(String s1: s)
        {
            System.out.print(s1 + " ");
        }System.out.println();

        System.out.println("Object Array After Sorting:---");

        Arrays.sort(s);
    
        for(String s1: s)
        {
            System.out.print(s1 + " ");
        }System.out.println();

        Arrays.sort(s, new MyComparator());

        System.out.println("Object Array After Sorting by Comparator:---");

        for(String s1: s)
        {
            System.out.print(s1 + " ");
        }System.out.println();
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
