class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    public String toString(){
        return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

    // public String toString(){
    //     return name+"---"+rollNo;
    // }

    public static void main(String[] args) {
        Student s1=new Student("Anuprash", 1);
        Student s2=new Student("Anirudh", 2);

        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
    }
}