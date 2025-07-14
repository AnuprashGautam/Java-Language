import java.lang.reflect.Method;

class Person implements Cloneable{

    String name;
    int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString()
    {
        return "Name: "+name+" Age: "+age;
    }
    
    public static void main(String[] args) {
        try {
            Person person1=new Person("Bob",25);
            Person person2=(Person)person1.clone();

            System.out.println(person1);
            System.out.println(person2);

            person2.name="John";
            person2.age=30;

            System.out.println(person1);
            System.out.println(person2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
