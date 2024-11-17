class Parent1 {
    String fathername;
    String mothername;
    Parent1(String fathername, String mothername)
    {
        this.fathername=fathername;
        this.mothername=mothername;
    }
}

class Child1 extends Parent1{
    String name;
    int age;
    Child1( String name, int age, String fathername, String mothername)
    {
        super(fathername,mothername);
        this.name=name;
        this.age=age;
    }
}

public class NeedOfParentConst
{
    public static void main(String [] args)
    {
        Child1 c1=new Child1("Rockey",15,"Ramesh","Mamta");
        System.out.println("Child name:"+c1.name);
        System.out.println("Child father's name:"+c1.fathername);
        System.out.println("Child mother's name:"+c1.mothername);
        System.out.println("Child age:"+c1.age);

    }
}
