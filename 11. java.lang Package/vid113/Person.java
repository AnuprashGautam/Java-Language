public class Person {
    String name;
    int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Person)
        {
            Person person=(Person)obj;
            if(name.equals(person.name)&&age==person.age)
            {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public int hashCode()
    {
        return name.hashCode()+age;
    }

    public static void main(String[] args) {
        Person p1=new Person("Anuprash", 30);
        Person p2=new Person("Anuprash", 30);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
