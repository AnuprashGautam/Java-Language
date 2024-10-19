public class DefaultClassesInterfaces 
{
    public static void main(String[] args) {

        /*Bydefault these two packages classes and interfaces are available to our code without import statements.
        1. java.lang
        2. default package (CWD)
        */

        String s=new String("Anuprash");
        System.out.println(s);

        Student std=new Student("Anuprash",1);
        System.out.println(std.name+"...."+std.roll);
    }
}
