public class MethodChainingDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Durga").append("Solutions").append("Software").append("Technology").insert(2, "xyz").reverse();
        System.out.println(sb);
    }
}
