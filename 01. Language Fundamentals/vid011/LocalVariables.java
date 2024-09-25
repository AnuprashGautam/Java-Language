public class LocalVariables {
    public static void main(String[] args) {
        
        for (int i=0;i<10;i++)
            System.out.println(i);

        // System.out.println(i);               // Compilation error


        // Only applicable modifier for the local variable is final.
        // JVM don't provide the default values for local variables.
        // Local varibales are thread safe.
        // As long as we are not using a local varibale, we are not required not initialise it. But it is recommended to initialise atleast with the default values.
        
        int[] arr=new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);                           // Array concept that if we instantiate an array then automatically its all elemnts get filled with the default value of array datatype.
    }
}
