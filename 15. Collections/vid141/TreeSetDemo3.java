import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
    int empId;
    String empName;

    Employee(int empId, String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    public String toString()
    {
        return empName+"---"+empId;
    }

    // Default natural sorting order: increasing order of employees' id
    public int compareTo(Object obj1)
    {
        int id1=this.empId;

        Employee e=(Employee)obj1;
        int id2=e.empId;

        if(id1 < id2)
        {
            return -1;
        }else if(id1 > id2)
        {
            return 1;
        }else{
            return 0;
        }
    }
}

public class TreeSetDemo3
{
    public static void main(String[] args) {
        Employee e1=new Employee(10, "Anuprash Gautam");
        Employee e2=new Employee(1, "Anirudh Sharma");
        Employee e3=new Employee(20, "Rachit Deshwal");
        Employee e4=new Employee(5, "Ujjwal Vats");
        Employee e5=new Employee(4, "Chirag Mittal");
        Employee e6=new Employee(34, "Rakesh Dhawan");

        TreeSet<Employee> t=new TreeSet<>();

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);

        System.out.println("PRINTING THE EMPLOYESS ACCORDING THE DNSO:---------");
        System.out.println(t);

        TreeSet<Employee> t1=new TreeSet<>(new MyComparator());

        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);

        System.out.println("PRINTING THE EMPLOYESS ACCORDING THE CNSO:---------");
        System.out.println(t1);

    }
}

class MyComparator implements Comparator{

    public int compare(Object obj1, Object obj2)
    {
        Employee e1=(Employee)obj1;
        String e1Name=e1.empName;

        Employee e2=(Employee)obj2;
        String e2Name=e2.empName;

        return e1Name.compareTo(e2Name);
    }   
}


