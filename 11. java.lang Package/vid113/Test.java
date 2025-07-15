public class Test {

    public static void main(String[] args) {
        String s1=new String("durga");
        String s2=new String("durga");
        StringBuffer sb1=new StringBuffer("durga");
        StringBuffer sb2=new StringBuffer("durga");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        // System.out.println(s1==sb1);
        System.out.println(s1.equals(sb1));

        System.out.println("String objects hashcodes:---------------------");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("StringBuffer objects hashcodes:---------------------");
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
    }
}