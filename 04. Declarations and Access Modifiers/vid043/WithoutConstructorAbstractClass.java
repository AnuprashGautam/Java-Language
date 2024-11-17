abstract class Person 
{
    String hair;
    String name;
    double height;
    String fname;
    String mname;
    String city;
    int marks;
    String profession;
    String maritial;
}


class Student extends Person
{
    //In the student constructor we will have to define the parent class properties too. That will increase the code and also code redundancy.
    int roll_no;
    Student(String hair, String name, double height, String fname, String mname, String city, int marks, String profession, String maritial, int roll_no)
    {
        this.hair = hair;
        this.name = name;
        this.height = height;
        this.fname = fname;
        this.mname = mname;
        this.city = city;
        this.marks = marks;
        this.profession = profession;
        this.maritial = maritial;
        this.roll_no = roll_no;
    }
}

class Teacher extends Person
{
    //In the teacher constructor we will have to define the parent class properties too. That will increase the code and also code redundancy.
    String stdy_sub;
    Teacher(String hair, String name, double height, String fname, String mname, String city, int marks, String profession, String maritial, String stdy_sub)
    {
        this.hair = hair;
        this.name = name;
        this.height = height;
        this.fname = fname;
        this.mname = mname;
        this.city = city;
        this.marks = marks;
        this.profession = profession;
        this.maritial = maritial;
        this.stdy_sub = stdy_sub;
    }
}


public class WithoutConstructorAbstractClass
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Black", "Rahul", 5.8, "Ramesh", "Sunita", "Delhi", 90, "Student", "Unmarried", 101);
        Teacher t1 = new Teacher("Black", "Rahul", 5.8, "Ramesh", "Sunita", "Delhi", 90, "Teacher", "Unmarried", "Maths");
    }
}