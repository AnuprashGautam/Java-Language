import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();

        FileInputStream fis=new FileInputStream("db.config");
        p.load(fis);

        System.out.println("PRINTING THE DATABASE CONFIGURATIONS:---\n");

        String url=p.getProperty("url");
        String userName=p.getProperty("username");
        String password=p.getProperty("password");

        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);

        System.out.println("\n MAKING DATABASE CONNECTION:---\n");

        Connection con=DriverManager.getConnection(url, userName, password);

        if(con!=null) System.out.println("Connection established successfully.");
        else    System.out.println("Something went wrong.");
    }
}
