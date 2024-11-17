// Abstract class Person
abstract class Person {
    String hair;
    String name;
    double height;
    String fname;
    String mname;
    String city;
    int marks;
    String profession;
    String maritial;

    // Constructor to initialize Person properties
    Person(String hair, String name, double height, String fname, String mname, String city, int marks, String profession, String maritial) {
        this.hair = hair;
        this.name = name;
        this.height = height;
        this.fname = fname;
        this.mname = mname;
        this.city = city;
        this.marks = marks;
        this.profession = profession;
        this.maritial = maritial;
    }
}

// Class Student extends Person
class Student extends Person {
    // In the student constructor we will have to define the parent class properties too. That will increase the code and also code redundancy.
    int roll_no;

    // Constructor to initialize Student properties along with parent class properties
    Student(String hair, String name, double height, String fname, String mname, String city, int marks, String profession, String maritial, int roll_no) {
        super(hair, name, height, fname, mname, city, marks, profession, maritial);
        this.roll_no = roll_no;
    }
}

// Class Teacher extends Person
class Teacher extends Person {
    // In the teacher constructor we will have to define the parent class properties too. That will increase the code and also code redundancy.
    String stdy_sub;

    // Constructor to initialize Teacher properties along with parent class properties
    Teacher(String hair, String name, double height, String fname, String mname, String city, int marks, String profession, String maritial, String stdy_sub) {
        super(hair, name, height, fname, mname, city, marks, profession, maritial);
        this.stdy_sub = stdy_sub;
    }
}

// Main class to test the implementation
public class WithConstructorAbstractClass {
    public static void main(String[] args) {
        // Creating Student object
        Student s1 = new Student("Black", "Rahul", 5.8, "Ramesh", "Sunita", "Delhi", 90, "Student", "Unmarried", 101);

        // Creating Teacher object
        Teacher t1 = new Teacher("Black", "Rahul", 5.8, "Ramesh", "Sunita", "Delhi", 90, "Teacher", "Unmarried", "Maths");
    }
}
