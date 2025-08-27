import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap chm=new ConcurrentHashMap();

        chm.put(101,"A");
        chm.put(102, "B");
        chm.putIfAbsent(103, "C");
        chm.putIfAbsent(101, "D");
        chm.remove(101, "D");
        chm.replace(102, "B","E");

        System.out.println(chm);
    }
}
