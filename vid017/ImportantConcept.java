package vid017;

public class ImportantConcept {
    // Difference between b=b+1 and b++.

    public static void main(String[] args) {
        byte b=10;
        // b=b+1;                //CE. Because b+1 doesnot have the implicit typecasting as like b++. ie. b++   =   b=(byte)(b+1)
        b++;
        System.out.println(b);
    }

}
