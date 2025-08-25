import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main (String[] args)
    {
        TreeMap m=new TreeMap();

        m.put(100,"ZZZ");
        m.put(103,"YYY");
        m.put(101,"XXX");
        // m.put("FFF","XXX");
        // m.put(null,"XXX");

        System.out.println(m);
    }
}