public class Student1 {
    String name;
    int rollNo;

    Student1 (String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    public boolean equals(Object obj)
    {
        try {
            String name1=this.name;
            int rollNo1=this.rollNo;
            Student s=(Student)obj;
            String name2=s.name;
            int rollNo2=s.rollNo;

            if(name1.equals(name2) && rollNo1==rollNo2)
            {
                return true;
            }else{
                return false;
            }

        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    public static void main(String [] args)
    {
        Student1 s1=new Student1("Anuprash", 1);
        Student1 s2=new Student1("Anirudh", 2);
        Student1 s3=new Student1("Anuprash", 1);
        Student1 s4=s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
