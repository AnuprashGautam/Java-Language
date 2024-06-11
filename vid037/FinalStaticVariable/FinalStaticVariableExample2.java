public class FinalStaticVariableExample2 {

    final static int x; // we must have to provide the initialization of the final sttaic variable
                 // before the CLASS LOADING.

    // final int x=20;                        //First way

    static {                                        
        x = 20;                               //Second way
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
