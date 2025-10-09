enum Beer{
    KF, KO, RC, FO;
}

public class Test {
    public static void main(String[] args) {
        Beer[] beers=Beer.values();

        for(Beer b: beers)
        {
            System.out.println(b+"---"+b.ordinal());
        }
    }
}
