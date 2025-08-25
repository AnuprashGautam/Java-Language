import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1
{
    public static void main (String[] args)
    {
        TreeMap m=new TreeMap(new MyComparator());

        m.put("XXX",10);
        m.put("AAA",20);
        m.put("ZZZ",30);
        m.put("LLL",40);

        System.out.println(m);
    }
}

class MyComparator implements Comparator {

    public int compare(Object obj1, Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();

        return s2.compareTo(s1);
    }

}