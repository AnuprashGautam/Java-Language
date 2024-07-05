// While child creation parent object is not created, only parent class constructor is executed to initialise the parent class properties.

class parent1{
    parent1(){
        System.out.println(this.hashCode());
    }
}

class child1 extends parent1{
    child1(){
        System.out.println(this.hashCode());
    }
}

public class ParentObjectCeationDuringChildObjectCreation
{
    public static void main(String[] args) {
        child1 c1=new child1();
        System.out.println(c1.hashCode());
    }
}