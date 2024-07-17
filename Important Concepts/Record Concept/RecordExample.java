record Student(String name, int age){}

public class RecordExample
{
    public static void main (String[] args)
    {
        Student a=new Student("Aryan", 20);
        Student b=new Student("Anuprash", 20);
        Student c=new Student("Anirudh", 20);
        System.out.println(a.name());
        System.out.println(a.age());
        System.out.println(b.name());
        System.out.println(b.age());
        System.out.println(c.name());
        System.out.println(c.age());
    }
}