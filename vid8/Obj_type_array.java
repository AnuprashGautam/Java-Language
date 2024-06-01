public class Obj_type_array {
    public static void main(String[] args) {

        Object[] a=new Object[10];                          // Object type array
        a[0]=new Integer(4);                      //Child class array
        a[1]=new Object();                       //Declared type array
        a[2]=new String("Anuprash");     //Child class array

        Number[] i=new Number[10];
        i[0] = new Integer(2);                   //Child class   
        i[1]=new Long(5l);                      //Child class
        i[2]=new Float(5);                      //Child class
        // i[3]=new String("Anuprash");             // will give the compile time error
        

    }
}
