import java.text.NumberFormat;

public class NumberFormatDemo {

    public static void main(String[] args) {
        double d=1.1;

        NumberFormat nf=NumberFormat.getInstance();

        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(d));

        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(d));

        nf.setMaximumIntegerDigits(3);
        System.out.println(nf.format(d));

        nf.setMinimumIntegerDigits(2);
        System.out.println(nf.format(d));
    }
}