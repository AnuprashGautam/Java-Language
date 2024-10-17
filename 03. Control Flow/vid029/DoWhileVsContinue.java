public class DoWhileVsContinue {
    public static void main(String[] args) {
        //It is a dangerous combination.
        int x = 0;
        do {
            x++;
            System.out.println(x);
            if (++x < 5)
                continue;
            x++;
            System.out.println(x);
        } while (++x < 10);
    }
}
