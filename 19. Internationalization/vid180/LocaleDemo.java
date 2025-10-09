import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale l1= Locale.getDefault();
        System.out.println(l1.getCountry()+"---"+l1.getLanguage());
        System.out.println(l1.getDisplayCountry()+"---"+l1.getDisplayLanguage());

        Locale l2=new Locale("pa","In");
        // Locale.setDefault(l2);
        System.out.println(Locale.getDefault().getDisplayLanguage());
        System.out.println(Locale.getDefault().getDisplayCountry());

        String[] s3=Locale.getISOLanguages();
        for(String s: s3)
        {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------------");

        String[] s4=Locale.getISOCountries();
        for(String s: s4)
        {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------------------------");

        Locale[] l3=Locale.getAvailableLocales();
        for(Locale l: l3)
        {
            System.out.println(l.getDisplayCountry()+"---"+l.getDisplayLanguage());
        }
    }
}
