class MyException extends RuntimeException{
    MyException(String str){
        super(str);
    }
}

public class Test3 {
    public static void main(String[] args) {
        throw new MyException("This is the custom exception.");
    }
}
