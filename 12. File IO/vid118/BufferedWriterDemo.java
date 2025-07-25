import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File f=new File("writefile.txt");
        BufferedWriter bw=null;

        try {
            bw=new BufferedWriter(new BufferedWriter(new FileWriter(f)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            bw.write(100);
        bw.newLine();
        bw.write(new char[]{'a','b','c'});
        bw.newLine();
        bw.write("Hello World");
        } catch (IOException e) {
            // TODO: handle exception
        }finally{
            try {
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
