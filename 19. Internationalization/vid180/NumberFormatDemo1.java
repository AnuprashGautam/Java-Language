import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {

    public static void main(String[] args) {
        double d=123456.789;

        Locale india=new Locale("pa", "IN");

        NumberFormat nf=NumberFormat.getCurrencyInstance(india);
        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);


        System.out.println("The amount in Indian currency format: "+nf.format(d));
        System.out.println("The amount in American currency format: "+nf1.format(d));
        System.out.println("The amount in UK currency format: "+nf2.format(d));

    }
}