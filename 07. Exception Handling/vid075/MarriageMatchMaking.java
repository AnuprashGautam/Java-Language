import java.io.BufferedReader;
import java.io.InputStreamReader;

class UnderAgeException extends RuntimeException{
    String des;

    UnderAgeException(String des){
        super(des);
    }
}

class OverAgeException extends RuntimeException{
    String des;

    OverAgeException(String des){
        super(des);
    }
}


public class MarriageMatchMaking {
    public static void main(String[] args) {
        int age=0;

        InputStreamReader i= new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(i);

        System.out.print("Enter your age: ");
    
        try {
            age=Integer.parseInt(bf.readLine());
        } catch (Exception e) {
            System.out.println("Age could not be captured: "+e);
        }finally{
            try {
                bf.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        if(age<=18){
            throw new UnderAgeException("Sorry!!! You are too young to be married.");
        }else if(age>=60){
            throw new OverAgeException("Ahhh!!! You are too late.");
        }else{
            System.out.println("Nice!!! You will get the perfect match soon.");
        }
    }
}
