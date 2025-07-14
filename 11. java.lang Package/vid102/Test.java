import java.util.ArrayList;

public class Test {
    public String toString()
    {
        return "test";
    }

    public static void main(String[] args) {
        String s=new String("This is the new string.");
        System.out.println(s);

        ArrayList l=new ArrayList<>();
        l.add("Ram");
        l.add("Shyam");
        l.add("Radha");
        System.out.println(l);

        Test t=new Test();
        System.out.println(t);
    }
}
