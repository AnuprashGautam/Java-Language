public class EqualsMethodAndEqualityOperators 
{
    public static void main(String[] args) 
    {
        //equals() is used for the content comparision while equality operators are used for the address comparision.
        String s1=new String("Anuprash");
        String s2=new String("Anuprash");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);


        //Malicious codes
        System.out.println(s1==null);
        System.out.println(null==null);
        System.out.println(null!=null);
        String s3=null;
        System.out.println(s3==null);
    }
}
