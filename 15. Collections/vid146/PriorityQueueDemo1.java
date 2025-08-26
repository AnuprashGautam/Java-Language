import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        // PriorityQueue q=new PriorityQueue();
        PriorityQueue q = new PriorityQueue(15, new MyComparator());

        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");

        System.out.println(q);

        System.out.println("Printing the queue elements one by one:----");

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = String.valueOf(obj1);
        String s2 = String.valueOf(obj2);

        return s2.compareTo(s1);
    }
}