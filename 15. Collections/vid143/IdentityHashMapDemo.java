import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // HashMap m=new HashMap<>();
        IdentityHashMap m=new IdentityHashMap();

        Integer I1=1000;
        Integer I2=1000;

        m.put(I1, "pawan");
        m.put(I2, "kalyan");

        System.out.println(m);
    }
}
