import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            System.out.println("Statement 2");
            System.out.println("Statement 3");
            System.out.println(10/0);                        // Unchecked Exception
            fis=new FileInputStream("test.txt");        // Checked Exception        
        }catch(Exception e){
            try {
                System.out.println(10/0);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Statement 5");
    }
}
