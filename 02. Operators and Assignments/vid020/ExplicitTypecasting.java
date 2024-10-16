public class ExplicitTypecasting 
{
    //Narrowing or Downcasting
    //Require when we want to assign the big datatype to small datatype.
    //Lost of info may happen.

    public static void main(String[] args) {
        int x=130;
        double d=10.23;
        int y=(int)d;
        byte b=(byte)x;
        System.out.println(b);
        System.out.println(y);

        //In the below example explicit typecasting is happening twice.
        // Double  ----->  Integer(decimal part is removed)   -------->    byte
        double e=130.987;
        byte b1=(byte)e;
        System.out.println(b1);
    }
}
