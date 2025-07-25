import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String [] args)
    {
        FileWriter fw1=null;
        FileWriter fw2=null;
        FileWriter fw3=null;
        FileWriter fw4=null;
        
        try {
            fw1=new FileWriter("fw1.txt");
            fw2=new FileWriter("fw2.txt");
            fw3=new FileWriter("fw3.txt");
            fw4=new FileWriter("fw4.txt",true);

            File f=new File("old.txt");
            fw2=new FileWriter(f);

            fw1.write('a');
            fw2.write("Hellow World");
            fw3.write(new char[]{'a','b','c',' ','d','e'});
            fw4.write("Anuprash Gautam.");

        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            try {
                fw1.flush();
                fw2.flush();
                fw3.flush();
                fw4.flush();
                fw1.close();
                fw2.close();
                fw3.close();
                fw4.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
