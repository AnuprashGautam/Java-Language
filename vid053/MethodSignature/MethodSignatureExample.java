// Method Signature= Method name+ Arguement types
// In class two methods with same method signature is not allowed.
// Method signature is used by the compiler to resolve the method calls.

public class MethodSignatureExample 
{
    public int addNum(int a, int b)
    {
        return a+b;
    }

    // public int addNum(int a, int b)
    // {
    //     return a+b;
    // }

    public static void main(String[] args) {
        MethodSignatureExample ms=new MethodSignatureExample();
        int n=ms.addNum(5,4);
        System.err.println(n);
    }
}
