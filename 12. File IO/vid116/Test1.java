import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        File f=new File("D:\\Coding\\Java Language\\Durga Classes");

        if(f.exists()){
            String[] directoryList=f.list();
            int count=0;
            System.out.println("What do you want to see: file/folder?");
            String choice=scanner.nextLine();

            switch (choice) {
                case "file":
                    for (String dir : directoryList) {
                        File f1=new File(f,dir);
                        if(f1.isFile())
                        {
                            count++;
                            System.out.println(f1);
                        }
                    }
                    System.out.println("The total files present in the "+"f"+" are:"+count);
                    break;

                case "folder":
                    for (String dir : directoryList) {
                        File f1=new File(f,dir);
                        if(f1.isDirectory())
                        {
                            count++;
                            System.out.println(f1);
                        }
                    }
                    System.out.println("The total files present in the "+"f"+" are:"+count);
                    break;
            
                default:
                    System.out.println("Invalid input.");
            }

        }else{
            System.out.println("The folder doesn't exits anymore.");
        }
        
    }
}
