public final class Test2 {
    private int i;

    Test2(int i)
    {
        this.i=i;
    }

    public Test2 modify(int i)
    {
        if(this.i==i)
        {
            return this;
        }else{
            return new Test2(i);
        }
    }

    public static void main(String[] args) {
        Test2 t1=new Test2(10);
        Test2 t2=t1.modify(100);
        Test2 t3=t1.modify(10);

        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
