public class Test1 {
    public static void main(String[] args) {
        String course= System.getProperty("course");
        if(course.equals("scjp"))
        {
            System.out.println("SCJP Information");
        }
        else{
            System.out.println("Other course information.");
        }
    }
}
