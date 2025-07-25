import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File f=new File("readfile.txt");
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            String str=br.readLine();
            while(str!=null)
            {
                System.out.println(str);
                str=br.readLine();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
