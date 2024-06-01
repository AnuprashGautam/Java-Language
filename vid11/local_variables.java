public class local_variables {
    public static void main(String[] args) {
        //for local var, jvm don't provide the default value. If we are using local var, must have to provide the value otherwise no need to initialize.
        int i=0;
        int a;              
        for (int j = 0; j < 3; j++) 
        {
            i=i+j;
        }
        // System.out.println(i+"----"+j);               //Compile time errro due to loacl variable j.

        int[] x=new int[3];
        System.out.println(x);
        System.out.println(x[0]);                       //In the case of the array, after creation, automically every elements get initialized by the default value irresepective of its type: local, static, instance.
    }
}
