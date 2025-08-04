import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterDemo{
    public static void main(String[] args) {
        FileWriter fw=null;
        PrintWriter pw=null;
        try {
            fw = new FileWriter("abc.txt");
            pw=new PrintWriter(fw);
            pw.write(100);
            pw.println(100);
            pw.println(true);
            pw.println('c');
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            pw.flush();
            pw.close();
        }

    }
}