import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) {
        double d=123456.789;
        NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);

        System.out.println("The number in Italic number format: "+nf.format(d));

    }
}