public class XxxValueDemo {

    public static void main(String[] args) {
        Integer i=Integer.valueOf(10);

        byte b=i.byteValue();
        short s=i.shortValue();
        int in=i.intValue();
        long l=i.longValue();
        float f=i.floatValue();
        double d=i.doubleValue();

        Character c=Character.valueOf('a');
        char ch=c.charValue();

        Boolean bool=Boolean.valueOf(true);
        boolean b1=bool.booleanValue();
    }
}