import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo2 {
  public static void main(String[] args) {
    Locale india = new Locale("eg", "IN");
    System.out.println("US form: " + DateFormat.getDateTimeInstance(0,0, Locale.US).format(new Date()));
    System.out.println("UK form: " + DateFormat.getDateTimeInstance(0,0, Locale.UK).format(new Date()));
    System.out.println("India form: " + DateFormat.getDateTimeInstance(0,0, india).format(new Date()));
    System.out.println("ITALY form: " + DateFormat.getDateTimeInstance(0,0, Locale.ITALY).format(new Date()));
  }
}
