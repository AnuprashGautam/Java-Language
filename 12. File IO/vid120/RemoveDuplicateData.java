import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicateData {
    public static void main(String[] args) {

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader("input1.txt"));
            PrintWriter writer = new PrintWriter("output1.txt");
        ) {
            String line = reader1.readLine();

            while (line != null) {

                // Make sure whatever we wrote so far is actually saved
                writer.flush();

                boolean isAvailable = false;

                // Read the output file freshly for every line
                try (BufferedReader reader2 =
                         new BufferedReader(new FileReader("output1.txt"))) {

                    String target = reader2.readLine();

                    while (target != null) {
                        if (line.equals(target)) {
                            isAvailable = true;
                            break;
                        }
                        target = reader2.readLine();
                    }
                }

                // Write only if not found
                if (!isAvailable) {
                    writer.println(line);
                }

                line = reader1.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
