// new is used to create the object while Constructor is used to initialsize that object.

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println(this);
        System.out.println(hashCode());
    }
}

public class NewAndConstructorConcept {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 001);
        System.out.println("Name of the student:"+ s1.name);
        System.out.println("Roll no of the student:"+ s1.roll);

        Student s2 = new Student("Shyam", 002);
        System.out.println("Name of the student:"+ s2.name);
        System.out.println("Roll no of the student:"+ s2.roll);
    }
}
