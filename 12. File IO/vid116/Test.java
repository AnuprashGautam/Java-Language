import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        // For file
        File f = new File("abc.txt");
        System.out.println(f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("The file didn't created:" + e);
        }
        System.out.println(f.exists());

        // For directory (Folder)
        File f1 = new File("MyFolder");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());

        // Creating the file 'new.txt' in 'MyFolder'
        // File f2=new File(f1,"new.txt");
        File f2 = new File("MyFolder", "new.txt");
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f2.exists());

        // Creating a file in the D: directory
        File f3 = new File("D://", "JavaFolder");
        System.out.println("Does this folder exits in the D: directory?" + f3.exists());
        f3.mkdir();
        System.out.println("Does this folder exits in the D: directory?" + f3.exists());

        File f4 = new File(f3, "newdir.txt");
        System.out.println("Does this file exits in the D: directory?" + f4.exists());
        try {
            f4.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Does this file exits in the D: directory?" + f4.exists());

        System.out.println("File class methods----------------------------");

        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println(f3.isDirectory());
        System.out.println(f4.isDirectory());

        System.out.println("I am printing the sub directories of this directory:-");
        File f5 = new File("MyFolder");
        String[] fileStrings = f5.list();
        for (String str : fileStrings) {
            System.out.println(str);
        }
    }
}