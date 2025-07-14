public class Student {
    String name;
    int rollNo;

    Student (String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main(String [] args)
    {
        Student s1=new Student("Anuprash", 1);
        Student s2=new Student("Anirudh", 2);
        Student s3=new Student("Anuprash", 1);
        Student s4=s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
