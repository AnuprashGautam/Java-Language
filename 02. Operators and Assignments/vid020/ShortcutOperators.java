public class ShortcutOperators {
     public static void main(String[] var0) {
        int var1 = 10;
        ++var1;
        if (var1 < 10 && var1 / 0 > 10) {
            System.out.println("Code is running fine.");
        } else {
            System.out.println("Code is not running fine.");
        }

    }
}