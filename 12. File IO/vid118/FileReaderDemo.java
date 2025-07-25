import java.io.CharArrayReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fr1 = null;
        FileReader fr2 = null;

        // Reading file with the help of read() method.

        try {
            fr1 = new FileReader("new.txt");

            int i = fr1.read();

            while (i != -1) {
                System.out.print((char)i);
                i = fr1.read();
            }
            System.out.println();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fr1.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // Reading the file with the help of read(char[] ch) method.

        File f = new File("new.txt");
        char[] ch = new char[(int) f.length()];

        try {
            fr2 = new FileReader(f);
            fr2.read(ch);

            System.out.println(ch);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                fr2.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}