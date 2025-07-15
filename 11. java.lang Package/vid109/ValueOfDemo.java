public class ValueOfDemo {
    public static void main(String [] args)
    {
        byte b=12;
        Byte b1=Byte.valueOf(b);
        Byte b2=Byte.valueOf("1");
        Byte b3=Byte.valueOf("1001",4);

        Integer i=Integer.valueOf(123);
        Integer i1=Integer.valueOf("123");
        Integer i3=Integer.valueOf("1003",5);
        // Integer i4=Integer.valueOf("1003",37);

        Character c1=Character.valueOf('c');
        // Character c2=Character.valueOf("c");
    }
}
