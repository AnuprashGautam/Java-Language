import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        System.out.println("Full form: "+DateFormat.getDateInstance(0, Locale.US).format(new Date()));
        System.out.println("Long form: "+DateFormat.getDateInstance(1, Locale.US).format(new Date()));
        System.out.println("Medium form: "+DateFormat.getDateInstance(2, Locale.US).format(new Date()));
        System.out.println("Small form: "+DateFormat.getDateInstance(3, Locale.US).format(new Date()))
  ;  }
}
