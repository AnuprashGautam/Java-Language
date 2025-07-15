public class InternMethodDemo {
    public static void main(String[] args) {
        String s1=new String("durga");
        String s2=s1.concat("software");
        String s3=s2.intern();
        System.out.println(s2==s3);    // Don't know why it is returning the true.  :/
        String s4="durgasoftware";
        System.out.println(s3==s4);
    }
}
