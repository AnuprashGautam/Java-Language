import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo1 {
  public static void main(String[] args) {
    System.out.println("US form: " + DateFormat.getDateInstance(0, Locale.US).format(new Date()));
    System.out.println("UK form: " + DateFormat.getDateInstance(0, Locale.UK).format(new Date()));
    System.out.println("ITALY form: " + DateFormat.getDateInstance(0, Locale.ITALY).format(new Date()));
  }
}
