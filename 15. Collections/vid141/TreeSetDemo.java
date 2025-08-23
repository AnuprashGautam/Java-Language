import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main (String[] args)
    {
        TreeSet<String> t=new TreeSet<>(new MyComparator());
        t.add("Anuprash");
        t.add("Gautam");
        t.add("Chirag");
        t.add("Rajive");
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int  compare(Object obj1, Object obj2)
    {
        String s1=(String)obj1;
        String s2=(String)obj2;

        return -s1.compareTo(s2);
    }
}