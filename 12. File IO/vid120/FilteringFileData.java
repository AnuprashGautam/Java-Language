import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FilteringFileData {
    public static void main(String[] args) {
        PrintWriter pw = null;
        BufferedReader br1 = null;
        BufferedReader br2 = null;

        try {
            pw = new PrintWriter("result.txt");
            br1 = new BufferedReader(new FileReader("input.txt"));
            

            String inputString = br1.readLine();

            while (inputString != null) {
                boolean isPresent = false;

                br2 = new BufferedReader(new FileReader("delete.txt"));
                String deleteString = br2.readLine();

                while (deleteString != null) {
                    if (inputString.equals(deleteString)) {
                        isPresent = true;
                        break;
                    } else {
                        deleteString = br2.readLine();
                    }
                }

                br2.close();

                if(!isPresent){
                    pw.println(inputString);
                }
                inputString=br1.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                br1.close();
                br2.close();
                pw.flush();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
