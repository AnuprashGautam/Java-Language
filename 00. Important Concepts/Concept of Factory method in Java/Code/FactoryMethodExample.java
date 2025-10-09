package Code;
interface Animal
{
    void sound();
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Woof woof!!!");
    }
}

class Cat implements Animal {

    public void sound()
    {
        System.out.println("Meow meow!!!");
    }
}

class Goat implements Animal {

    public void sound()
    {
        System.out.println("Mahh Mahh!!!");
    }
}

class AnimalFactory
{
    static Animal createAnimal(String type)
    {
        if(type.equalsIgnoreCase("dog"))
        {
            return new Dog();
        }else if(type.equalsIgnoreCase("cat"))
        {
            return new Cat();
        }else if(type.equalsIgnoreCase("goat"))
        {
            return new Goat();
        }
        return null;
    }
}

public class FactoryMethodExample
{
    public static void main (String[] args)
    {
        Animal a1=AnimalFactory.createAnimal("lion");
        Animal a2=AnimalFactory.createAnimal("dog");
        Animal a3=AnimalFactory.createAnimal("cat");
        Animal a4=AnimalFactory.createAnimal("goat");
    }
}