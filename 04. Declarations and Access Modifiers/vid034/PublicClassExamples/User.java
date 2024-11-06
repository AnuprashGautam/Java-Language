package secondpackage;

import firstpackage.Calculator;

public class User {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        Calculator.add(a,b);
        Calculator.sub(a,b);
        Calculator.mul(a,b);
        Calculator.divide(a,b);
    }
}
