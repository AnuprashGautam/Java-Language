enum Beer{
    KF(70), KO(80), RC(90), FO;

    int price;

    Beer(int price)
    {
        this.price=price;
    }

    Beer()
    {
        this.price=65;
    }

    public int getPrice()
    {
        return price;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Beer[] beers= Beer.values();
        for(Beer b: beers)
        {
            System.out.println(b+"---"+b.getPrice());
        }
    }
}
