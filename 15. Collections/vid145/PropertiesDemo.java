import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();

        FileInputStream fis=new FileInputStream("abc.properties");
        p.load(fis);

        System.out.println(p);

        System.out.println(p.getProperty("city"));

        p.setProperty("gender", "male");

        FileOutputStream fos=new FileOutputStream("abc.properties");
        p.store(fos,"Added a new property, gender");

    }
}
