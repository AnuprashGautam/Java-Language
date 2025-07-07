import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(BufferedReader buff=new BufferedReader(new FileReader("input.txt"));
            FileWriter fw=new FileWriter("output.txt")){
            // Risky Code

            buff=new BufferedReader(new FileReader("input1.txt"));
        }catch(IOException e){
            // Handling Code
        }
    }
}
