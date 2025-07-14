public class FinalImmutableDemo {
    public static void main(String[] args) {
        final StringBuffer sb=new StringBuffer("durga");
        sb.append("software");
        System.out.println(sb);

        // sb=new StringBuffer("Durga Soft");
    }
}
