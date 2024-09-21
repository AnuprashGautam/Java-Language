class InstanceStaticVariablesExample 
{
    //Instance variable: separate copy is created for every for every object. It can be accessed after object referenece. By default value is provided.

    //Static variable: same value is shared among every object. By default value is provided.

    int x;
    static int y=100;
    public static void main(String[] args)            //static area
    {
        InstanceStaticVariablesExample a=new InstanceStaticVariablesExample(); //Accessong the instance varaible after maing the referenec variable.
        System.out.println(a.x);



        System.out.println(y);                  //acessing statis var directly
        System.out.println(InstanceStaticVariablesExample.y);      //acessing statis var using class name
        System.out.println(a.y);                //acessing statis var object reference


        //beacsuse the static var is shared, so if it is changed by any object then it retains its cahnged value.
        InstanceStaticVariablesExample p=new InstanceStaticVariablesExample();
        p.y=200;
        p.x=200;
        InstanceStaticVariablesExample q=new InstanceStaticVariablesExample();
        q.x=300;
        System.out.println(q.y+"''''''"+q.x);

        a.main();   // Accessing the main() method's vaiable from non static area.
    }

    public void main()
    {
        System.out.println(y);                  //acessing static var from instance area
    }
}
