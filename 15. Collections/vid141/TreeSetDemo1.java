import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1
{
    public static void main (String[] args)
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("Anuprash");
        t.add("Gautam");
        t.add(new StringBuffer("Rohit"));
        t.add(new StringBuilder("Rakesh"));
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int  compare(Object obj1, Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();

        return s1.compareTo(s2);
    }
}