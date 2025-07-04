public class Test1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        
        
        try{
            System.out.println(arr[5]);
            System.out.println(10/0);
        }catch(ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }catch(ArithmeticException e2){
            e2.printStackTrace();
        }catch(RuntimeException e3){
            e3.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
