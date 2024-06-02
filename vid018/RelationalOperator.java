public class RelationalOperator {
    public static void main(String[] args) {
        //Relational operator can be implemented on primitive datatypes except bollean datatype.

        System.out.println(10<20);
        System.out.println('a'<97.5);
        System.out.println('a'<'A');
        System.out.println('a'<97);
        // System.out.println(true>false);                   //Will give the compile time error.

        //Can't apply relational operator for object types.
        // System.out.println("anu12345">"anu1");            //compile time error
    }
}
