public class Test1 {
    public static void main(String[] args) {
        String s="Hello";

        System.out.println(s.charAt(3));

        s=s+" World";
        System.out.println(s);

        String password1="abcdef";
        String password2="abcdEf";
        System.out.println(password1.equals(password2));
        System.out.println(password1.equalsIgnoreCase(password2));

        String s1="Anuradha Prashad";
        System.out.println(s1.substring(9));
        System.out.println(s1.substring(9, 12));

        System.out.println(s.length());

        System.out.println("ababa".replace('a', 'b'));
        
    }
}
