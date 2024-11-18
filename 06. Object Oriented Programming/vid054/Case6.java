// In overloading, method resolution is takes care by compiler based on reference type, runtime object doesn't play any role.

class Animal
{}
class Monkey extends Animal
{}

public class Case6 
{
    public void m1(Animal a)
    {
        System.out.println("Animal Version");
    }
    public void m1(Monkey m)
    {
        System.out.println("Monkey Version");
    }
    public static void main(String[] args) {
        Case6 c=new Case6();

        Animal a=new Animal();
        c.m1(a);

        Monkey m=new Monkey();
        c.m1(m);

        Animal am=new Monkey();
        c.m1(am);
    }
}
