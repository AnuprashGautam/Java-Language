import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("abc.txt");
        System.out.println(10/0);
    }
}