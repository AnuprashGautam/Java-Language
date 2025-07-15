public class ToStringDemo {

    public static void main(String[] args) {
        String s1=Integer.toString(10);
        String s2=Character.toString('c');
        String s3=Boolean.toString(false);

        String s4=Integer.toString(1234,2);
        System.out.println(s4);

        String s5=Integer.toBinaryString(1234);
        System.out.println(s5);

    }
}