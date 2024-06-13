public class StaticModifierExample1 {
    // Static modifier is used for inner class, variables and methods.
    static int x=10;
    int y=20;
    public static void main(String[] args) {
        StaticModifierExample1 t1 = new StaticModifierExample1();
        t1.x=888;
        t1.y=999;
        StaticModifierExample1 t2 = new StaticModifierExample1();
        System.out.println(t2.x+"..."+t2.y);
    }
}
