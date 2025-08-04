import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergingFiles {
    public static void main(String[] args) {
        PrintWriter pw=null;
        FileReader fr=null;
        BufferedReader br=null;

        try {
            pw=new PrintWriter("file3.txt");
            fr=new FileReader("file1.txt");
            br=new BufferedReader(fr);

            String readLine=br.readLine();
            while(readLine!=null)
            {
                pw.println(readLine);
                readLine=br.readLine();
            }

            fr=new FileReader("file2.txt");
            br=new BufferedReader(fr);

            readLine=br.readLine();
            while(readLine!=null)
            {
                pw.println(readLine);
                readLine=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                pw.flush();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
