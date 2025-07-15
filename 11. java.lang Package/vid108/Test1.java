public class Test1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Anurpash");

        System.out.println(sb.length());
        System.out.println(sb.capacity());      // 16+8=24
        System.out.println(sb.charAt(2));
        sb.setCharAt(2, 'b');
        System.out.println(sb);
        sb.append(12.3);
        sb.append(true);
        sb.append(" Gautam");
        System.out.println(sb);
        sb.insert(8,"xyz");
        System.out.println(sb);
        sb.delete(8, 26);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("Anuprash Guatam");
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(1000);
        System.out.println(sb1.capacity());
        sb1.trimToSize();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
    }
}
